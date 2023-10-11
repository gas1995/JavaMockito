package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddAllFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\"");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        manager.findAll();

        String[] expected = {"Бладшот", "Вперёд", "Отель \"Белград\"", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");

        manager.findAll();

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastTwoFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");

        manager.findLast();

        String[] expected = {"Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastFiveFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\"");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        manager.findLast();

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель \"Белград\"", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastFiveFilmsIfAddSevenFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\"");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        manager.findLast();

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель \"Белград\""};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastTwoFilmsIfLimitThreeFilms() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");

        manager.findLast();

        String[] expected = {"Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastThreeFilmsIfLimitThreeFilms() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\"");

        manager.findLast();

        String[] expected = {"Отель \"Белград\"", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastThreeFilmsIfLimitThreeFilmsIfAddFourFilms() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\"");
        manager.addFilm("Джентельмены");

        manager.findLast();

        String[] expected = {"Джентельмены", "Отель \"Белград\"", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastFilmsIfLimitSevenFilmsIfAddFourFilms() {
        PosterManager manager = new PosterManager(7);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\"");
        manager.addFilm("Джентельмены");

        manager.findLast();

        String[] expected = {"Джентельмены", "Отель \"Белград\"", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLastSevenFilmsIfLimitSevenFilmsIfAddSevenFilms() {
        PosterManager manager = new PosterManager(7);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\"");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        manager.findLast();

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель \"Белград\"", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
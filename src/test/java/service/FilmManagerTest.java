package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.FilmManager;

public class FilmManagerTest {

    @Test
    public void addedFilms0() {

        FilmManager manager = new FilmManager();

        String[] actual = manager.findAll();

        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedFilms1() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Movie 1");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedFilms3() {

        FilmManager manager = new FilmManager();
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromEmptyManager() {

        FilmManager manager = new FilmManager();
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromManager3() {

        FilmManager manager = new FilmManager();
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromManager5() {

        FilmManager manager = new FilmManager();
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");
        manager.addFilm("Movie 4");
        manager.addFilm("Movie 5");
        manager.findLast();

        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFromManager8() {

        FilmManager manager = new FilmManager(5);
        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");
        manager.addFilm("Movie 4");
        manager.addFilm("Movie 5");
        manager.addFilm("Movie 6");
        manager.addFilm("Movie 7");
        manager.addFilm("Movie 8");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
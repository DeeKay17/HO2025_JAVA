package com.sparta.dk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilmClassificationTests {
    @Test
    @DisplayName("FilmClassificationTests")
    public void firstTest() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Film Classification 12 or below")
    public void getClassificationsByAge_11() {
        int age = 11;
        String expected = "U, PG films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Film Classification 15 or below")
    public void getClassificationsByAge_15() {
        int age = 15;
        String expected = "U, PG & 12 films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Film Classification 18 or below")
    public void getClassificationsByAge_18() {
        int age = 18;
        String expected = "U, PG, 12 & 15 films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Film Classification 18 or above")
    public void getClassificationsByAge_20() {
        int age = 20;
        String expected = "All films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }
}
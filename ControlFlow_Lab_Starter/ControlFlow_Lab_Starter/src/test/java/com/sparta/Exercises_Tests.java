package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        assertEquals("It's hot", Exercises.getForecast(125));
    }
    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero()
    {
        int[] nums = {  };
        assertEquals(0, Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        assertEquals(expected, result);
    }

    // write unit tests for the 'Grade' method here

        @Test
        public void testGetGradeFail() {
            assertEquals("Fail", Exercises.universityGrading(20));
        }
         @Test
    public void testGetGradeDistinction() {
        assertEquals("Pass with Distinction", Exercises.universityGrading(95));}
    @Test
    public void testGetGradeMerit() {
        assertEquals("Pass with Merit", Exercises.universityGrading(62));}

    @Test
    public void testGetGradePass() {
        assertEquals("Pass", Exercises.universityGrading(45));}

    // write unit tests for the Scottish wedding example here
    @Test
    public void levelFourCovidLevel() {
        assertEquals(20, Exercises.maxAttendees(4));
    }
    @Test
    public void levelThreeCovidLevel() {
        assertEquals(50, Exercises.maxAttendees(3));
    }
    @Test
    public void levelTwoCovidLevel() {
        assertEquals(50, Exercises.maxAttendees(2));
    }
    @Test
    public void levelOneCovidLevel() {
        assertEquals(100, Exercises.maxAttendees(1));
    }
    @Test
    public void levelZeroCovidLevel() {
        assertEquals(200, Exercises.maxAttendees(0));
    }
    @Test
    public void levelFailCovidLevel() {
        assertEquals(0, Exercises.maxAttendees(-1));
    }
}

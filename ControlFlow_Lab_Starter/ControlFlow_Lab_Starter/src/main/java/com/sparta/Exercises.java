package com.sparta;

public class Exercises {
    public static void main(String[] args) {

    }
    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        String forecast = temp < 15 ? "It's cold" : "It's hot";
return forecast;
//        if (temp < 15)
//            return "It's cold";
//        else
//            return "It's hot";
    }

    // Question 2 OPTIONAL
    // returns the average of the array nums
    public static double average(int[] nums)
    {
        return -1;
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {

        String ticketType;

        if (age >= 60) {
            ticketType = "OAP";
        } else if (age >= 18) {
            ticketType = "Standard";
        } else if (age >= 13) {
            ticketType = "Student";
        } else if (age >= 5) {
            ticketType = "Child";
        } else {
            ticketType = "Free";
        }
        return ticketType; //Ask Nish if Intellij is smart enough to pick up that though anything over 18 is 'standard',
        // is intellij smart enough to know that there is already condition for 60 therefore it would never print standard for over 60?
    }

    // Question 4
    public static String universityGrading(int mark)
    {
        String mark2;

        if (mark >= 75 && mark <= 100) {
            mark2 = "Pass with Distinction";
        } else if (mark >= 60 && mark <= 74) {
            mark2 = "Pass with Merit";
        } else if (mark >= 40 && mark <= 59) {
            mark2 = "Pass";
        } else {
            mark2 = "Fail";
        }

        return mark2;
    }

    // Question 5
    //10:15am 20/06/2025 refer to recording to refer to this
    public static int maxAttendees(int alertLevel) {
    int attendees;
    switch (alertLevel) {
        case 4:
            attendees = 20;
            break;
        case 3:
        case 2:
            attendees = 50;
            break;
        case 1:
            attendees = 100;
            break;
        case 0:
            attendees = 200;
            break;
        default:
            attendees = 0;
            break;
    }
    return attendees;

//        switch (covidLevel) {
//            public static int getScottishMaxWeddingNumber(int covidLevel) {
//    int maxAttendees;
//
//    switch (covidLevel) {
//        case 4:
//            maxAttendees = 20;
//            break;
//        case 3:
//        case 2:
//            maxAttendees = 50;
//            break;
//        case 1:
//            maxAttendees = 100;
//            break;
//        case 0:
//            maxAttendees = 200;
//            break;
//        default:
//            maxAttendees = 0; // Return 0 for unknown levels
//            break;
//    }
    }
}

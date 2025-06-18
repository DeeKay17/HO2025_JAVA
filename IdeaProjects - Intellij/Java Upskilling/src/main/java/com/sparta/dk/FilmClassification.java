package com.sparta.dk;

public class FilmClassification {
    public static void main(String[] args) {
        int ageOfViewer = 15 ;
        String result1 = getClassificationsByAge(ageOfViewer);
        System.out.println(result1);
    }

    public static String getClassificationsByAge(int ageOfViewer) {
        String result;
        if (ageOfViewer < 18) {
            return "U, PG films are available.";
        } else if (ageOfViewer <= 15) {
            return "U, PG & 12 films are available.";
        } else if (ageOfViewer <= 18) {
            return "U, PG, 12 & 15 films are available.";
        } else {
            return "All films are available.";
        }
    }
}
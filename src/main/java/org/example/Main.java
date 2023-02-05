package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Test dates
        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2022, 5, 1),
                LocalDate.of(2022, 7, 1),
                LocalDate.of(2022, 1, 2),
                LocalDate.of(2022, 1, 1)
        );

        IDateSorter dateSorter = new DateSorter();
        List<LocalDate> sortedDates = (List<LocalDate>) dateSorter.sortDates(unsortedDates);

        System.out.println("Sorted Dates: " + sortedDates);
    }
}
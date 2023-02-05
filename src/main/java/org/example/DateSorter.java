package org.example;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DateSorter implements IDateSorter {

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        // Creating 2 separate lists to capture the desired dates
        List<LocalDate> rList = new ArrayList<>();
        List<LocalDate> noRList = new ArrayList<>();

        for (LocalDate date : unsortedDates) {
            if (date.getMonth().toString().contains("R")) {
                rList.add(date);
            } else {
                noRList.add(date);
            }
        }

        // Implementing given algorithm to dates sort
        rList.sort(LocalDate::compareTo);
        noRList.sort(Comparator.reverseOrder());
        // Gluing
        rList.addAll(noRList);
        return rList;
    }
}

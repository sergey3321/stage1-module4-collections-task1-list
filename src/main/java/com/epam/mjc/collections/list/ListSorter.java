package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        double valueA = 5 * Math.pow(numA, 2) + 3;
        double valueB = 5 * Math.pow(numB, 2) + 3;

        if (valueA < valueB) {
            return -1;
        } else if (valueA > valueB) {
            return 1;
        } else {
            return Integer.compare(numA, numB);
        }
    }
}

package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] arg = left.split("\\.");
        String[] arg1 = right.split("\\.");
        int res = Integer.compare(Integer.parseInt(arg[0]), Integer.parseInt(arg1[0]));

        return res == 0 ?  left.compareTo(right) : res;
    }
}
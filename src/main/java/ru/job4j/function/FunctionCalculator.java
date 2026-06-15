package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> list = new ArrayList<>();
        Double x = (double) start;
        while (x < end) {
            list.add(function.apply(x));

            x++;
        }


        return list;
    }
}
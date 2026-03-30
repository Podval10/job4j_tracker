package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        System.out.println(left.compareTo(right));
        int length = Integer.compare(left.length(), right.length()) > 0 ? right.length() : left.length();
        int result = 0;
         for (int i = 0; i < length; i++) {
            int temp = Character.compare(left.charAt(i), right.charAt(i));
           if (temp != 0) {
               result = temp;
               break;

           }

        }

//        return left.length() != right.length() && result==0? -1: result;
        return result == 0 ? Integer.compare(left.length(), right.length()) : result;
    }

}
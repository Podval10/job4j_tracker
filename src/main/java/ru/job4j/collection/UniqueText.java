package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String original : origin){
            check.add(original);
            System.out.println("original " + original );
        }
        for (String duplicat : text){
           if( !check.contains(duplicat)){
               result = false;
               break;
           }
            System.out.println("duplicat " + duplicat );

        }
        /* for-each origin -> new HashSet. */
        /* for-each text -> hashSet.contains */
        return result;
    }
}

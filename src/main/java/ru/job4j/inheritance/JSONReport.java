package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return  "{" +  System.lineSeparator() + "\t\"name\" :"+"\t\""+name+"\t\","
                + System.lineSeparator() + "\t\"body\" :"+"\t\""+body+"\t\"" +  System.lineSeparator() + "}"   ;


    }
}

package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {

         return "Неизвестное слово "  +  eng;
    }
    public static void main(String[] args) {
        DummyDic popa=new DummyDic();
        System.out.println( popa.engToRus("popki"));
        System.out.println(popa.engToRus("tra ra arar"));
    }
}

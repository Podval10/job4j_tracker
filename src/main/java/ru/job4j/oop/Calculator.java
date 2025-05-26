package ru.job4j.oop;

public class Calculator {
    private static int x = 5;
    private int resultSum;
    private int resultMinus;
    private  int resultMulty;
    private  int resultDivide;

    public Calculator(int y,int a, int z, int v){
        this.resultSum =y;
        this.resultMinus =v;
        this.resultMulty =z;
        this.resultDivide =a;

    }
    public Calculator(){

    }

    public static int sum(int y) {
        return x + y;
    }
    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z){
        return z-x;
    }

    public int divide(int v) {
        return v / x;
    }
    public int sumAllOperation(int t) {
        int result= sum(t)+minus(t)+multiply(t)+divide(t);
        return result;
    }
    public int sumAllOperation2() {
        int result= resultSum + resultDivide + resultMulty + resultMinus;
        return result;
    }

    public static void main(String[] args) {
        Calculator call=new Calculator();
        int sumPeremennaya = sum(4);
        int minusPeremennaya = minus(5);
        int multiPeremennaya = call.multiply(7);
        int dividePeremennaya = call.divide(6);
        System.out.println(sumPeremennaya);
        System.out.println(minusPeremennaya);
        System.out.println(multiPeremennaya);
        System.out.println(dividePeremennaya);
        Calculator popa=new Calculator(sumPeremennaya,minusPeremennaya,multiPeremennaya,dividePeremennaya);
        System.out.println(popa.sumAllOperation2());
    }
}

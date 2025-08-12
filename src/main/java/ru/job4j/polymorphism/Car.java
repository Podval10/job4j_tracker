package ru.job4j.polymorphism;

public class Car implements Transport{

    @Override
    public void move() {
        System.out.println("Он не может ехать");
    }

    @Override
    public void passengers(int count) {

    }

    @Override
    public int refuel(int fuel) {
        return 0;
    }

    public void vava(){
        System.out.println("assddesessw");
    }
}

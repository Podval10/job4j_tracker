package ru.job4j.polymorphism;

public class Bus extends Car{
    @Override
    public void move() {
        System.out.println("движения транспорта");
    }

    @Override
    public void passengers(int count) {
        System.out.println("установкa количества пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        return 0;
    }

    public void tututu(){
        System.out.println("assddesessw");
    }

    public static void main(String[] args) {
        Car car = new Bus();
        car.move();
//        Bus bus = (Bus) car;
//        bus.move();
//        car.move();
        car.vava();
        Bus bus = (Bus) car;
        bus.tututu();
    }
}

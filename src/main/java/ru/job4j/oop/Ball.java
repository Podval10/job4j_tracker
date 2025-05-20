package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition, String name){
if (condition==true){
    System.out.println(name + "  съел колобка!");
}
else {
    System.out.println("Колобок сбежал от "+ name + " !");
}

    }
}

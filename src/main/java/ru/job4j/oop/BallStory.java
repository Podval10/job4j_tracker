package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
Wolf wolf = new Wolf();
Ball ball = new Ball();
Fox fox = new Fox();
Hare hare = new Hare();
hare.tryEat(ball);
wolf.tryEat(ball);
fox.tryEat(ball);
    }
}

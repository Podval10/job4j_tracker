package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;


class PointTest {
    @Test
    void when00To20Then2() {
        Point point1=new Point(0,0);
        Point point2=new Point(2,0);
        double expected = 2;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00ToMinus20Then2() {
        Point point1=new Point(0,0,5);
        Point point2=new Point(2,0,5);
        double expected1 = 2;
        double output = point1.distance3d(point2);
        assertThat(output).isEqualTo(expected1, withPrecision(0.01));
    }

    @Test
    void when32To50Then2Dot82() {
        Point a = new Point(3, 2);
        Point b = new Point(5, 0);
        double expected2 = 2.82;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected2, withPrecision(0.01));
    }

    @Test
    void when00To20Then2a() {
        double itog = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(itog, withPrecision(0.01));
    }

    @Test
    void when00ToMinus20Then2a() {
        double itog1 = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, -2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(itog1, withPrecision(0.01));

    }

    @Test
    void when32To50Then2Dot82a() {
        double itog2 = 2.82;
        Point a = new Point(3, 2);
        Point b = new Point(5, 0);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(itog2, withPrecision(0.01));
    }
}


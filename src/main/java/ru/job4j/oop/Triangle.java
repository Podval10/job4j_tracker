package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a+b+c)/2;
    }

    public boolean exist(double ab, double ac, double bc) {
        boolean result = true;
        if (ab + ac < bc) {
            result= false;
        }
        return result;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            result = sqrt(p * (p - ab) * (p - ac) *(p - bc));
        } else{
            result = -1;
    }

        return result;
    }
}


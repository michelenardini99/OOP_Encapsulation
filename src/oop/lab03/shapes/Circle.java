package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Shape;

public class Circle implements Shape {
    
    public static final int ESP = 2;
    private final double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcPerimeter() {
        return 2 * Math.PI *this.radius;
    }

    public double calcArea() {
        return Math.PI * Math.pow(this.radius, ESP);
    }

}

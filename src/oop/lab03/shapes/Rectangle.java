package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Rectangle implements Polygon{

    private static final int EDGES = 4;
    private final double base;
    private final double height;
    
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public int getEdgeCount() {
        return EDGES;
    }

    public double calcPerimeter() {
        return (this.base*2)+(this.height*2);
    }

    @Override
    public double calcArea() {
        return this.base*this.height;
    }

}

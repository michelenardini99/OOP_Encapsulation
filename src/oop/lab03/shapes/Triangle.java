package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Triangle implements Polygon{

    private static final int EDGES = 3;
    private final int l1;
    private final int l2;
    private final int l3;
    
    public Triangle(int l1, int l2, int l3) {
        super();
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double calcPerimeter() {
        return this.l1+this.l2+this.l3;
    }

    @Override
    public double calcArea() {
        final double semiPer = this.calcPerimeter()/2;
        return Math.sqrt(semiPer * (semiPer - this.l1) * (semiPer - this.l2) * (semiPer - this.l3));
    }

    @Override
    public int getEdgeCount() {
        return EDGES;
    }

}

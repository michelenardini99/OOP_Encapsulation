package oop.lab03.shapes;

public class WorkWithShapes {

    public static void main(String[] args) {
        
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(3,10);
        Triangle t = new Triangle(3,9,9);
        
        System.out.println("Cerchio:\nPerimetro -> " + c.calcPerimeter() + "\nArea -> " + c.calcArea());
        System.out.println("Rettangolo:\nPerimetro -> " + r.calcPerimeter() + "\nArea -> " + r.calcArea() + "\nVertici -> " + r.getEdgeCount());
        System.out.println("Triangolo:\nPerimetro -> " + t.calcPerimeter() + "\nArea -> " + t.calcArea() + "\nVertici -> " + t.getEdgeCount());
    }

}

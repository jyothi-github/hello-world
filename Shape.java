/* nhgrif says:
 * Phrancis ready for inheritance/polymorphism?
 * Given the following abstract class:
 *
 *  public abstract class Shape {
 *      public abstract double area();
 *      public abstract double perimeter();
 *  }
 *
 * Implement a Circle, Triangle, and Rectangle class which extend the class Shape.
 * Ex: public class Circle extends Shape ... etc
 */

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
public class Rectangle extends Shape {
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

   
    public double area() {
        // A = w * l
        return width * length;
    }

    
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }

}
public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double area() {
        // A = p r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2pr
        return 2 * pi * radius;
    }
}
class Square extends Rectangle
{ private double side;
public Square(double side)
{ super(s);
this.side = side;
}
public double perimeter() // no abstract
{ return 4d*this.side;
}
public class TestShape {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Square test
        double a = 5;
        Rectangle Square = new Square(a);
        System.out.println("Square side length: " + a + "\nResulting Area: " + Square.area()
                + "\nResulting Perimeter: " + Square.perimeter() + "\n");
    }
}

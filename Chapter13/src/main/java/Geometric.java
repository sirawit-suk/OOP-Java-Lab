//After Midterm chapter 13...

import java.util.Date;

public abstract class Geometric {
    String color;
    Date dateCreated;
    protected Geometric() {
    }
    protected Geometric(String color) {
        this.color = color;
    }
    
    abstract double getArea();
    abstract double getPerimeter();
   
}
class Circle extends Geometric{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    } 
}

class Rectangle extends Geometric{

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
    
    
    
}

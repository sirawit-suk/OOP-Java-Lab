package pop.computer.chapter9;

public class Circle {

    private double radius;
    private String color;
    static int numberOfObjects = 0;
    private boolean isFilled;

    public Circle() {
        numberOfObjects++;
    }

    public Circle(double radius, String color, boolean isFilled) {
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
        numberOfObjects++;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", isFilled=" + isFilled + '}';
    }

}

//class TestCircle {
//
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        System.out.println(c1.getRadius());
//        System.out.println(c1.getColor());
//        System.out.println(c1.isIsFilled());
//        Circle c2 = new Circle(10000, "Red", true);
//        System.out.println(c2.getRadius());
//        System.out.println(c2.getColor());
//        System.out.println(c2.isIsFilled());
//
//        System.out.println(c1.toString());
//
//    }
//}

package Lab13;

public abstract class GeometricObject implements Comparable<GeometricObject>, Colorable{
    
    abstract double getArea();
    
    @Override
    public int compareTo(GeometricObject newObj) {
        if(getArea() > newObj.getArea()) return 1;
        else if(getArea() < newObj.getArea()) return -1;
        else return 0;
    }
    
    static Object max(GeometricObject Obj1, GeometricObject Obj2){
        if(Obj1.compareTo(Obj2) == 1) return Obj1;
        else if(Obj1.compareTo(Obj2) == -1) return  Obj2;
        else return Obj1;
    }
    
    
}
class Rectangle extends GeometricObject{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
   

    @Override
    double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

    @Override
    public void howToColor() {
        System.out.println("JUST PAINT THE RECTANGLE");
    }
    
}

class Circle extends GeometricObject{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public void howToColor() {
        System.out.println("JUST PAINT THE CIRCLE");
    }
    
}
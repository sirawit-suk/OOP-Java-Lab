
import java.util.Date;


public class Circle extends Geometric{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean isFilled, Date datecreated) {
        super(color, isFilled, datecreated);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String printCircle()
    {
        String s = "";
        s+= getClass() + " Radius = " + getRadius() + " " + super.toString();
        return s;
    }
    
    
    
}


import java.util.Date;


public class Rectangle extends Geometric{
    private double height;
    private double width; 

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String color, boolean isFilled, Date datecreated) {
        super(color, isFilled, datecreated);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}';
    }
    
    
    
    public String printRectangle()
    {
        String s = "";
        s += getClass() + " " + toString() + " " + super.toString();       
        return s;
    }
    
}

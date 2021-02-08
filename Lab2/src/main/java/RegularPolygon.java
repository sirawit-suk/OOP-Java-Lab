
public class RegularPolygon {

    private int side_Num = 0;
    private int length = 0;
    private double x_Origin = 0;
    private double y_Origin = 0;
    
    //Constructors
    RegularPolygon() {}
    RegularPolygon(int side_Num, int length) 
    {
        this.side_Num = side_Num;
        this.length = length;
    }
    RegularPolygon(int side_Num, int length, double x_Origin, double y_Origin) 
    {
        this.side_Num = side_Num;
        this.length = length;
        this.x_Origin = x_Origin;
        this.y_Origin = y_Origin;
    }
    
    //Mutators
    public void setNumSide(int side_Num)   
    {
        this.side_Num = side_Num;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public void setX_Origin(double x_Origin)
    {
        this.x_Origin = x_Origin;
    }
    public void setY_Origin(double y_Origin)
    {
        this.y_Origin = y_Origin;
    }
    
    //Accessors
    public int setNumSide()   
    {
        return side_Num;
    }
    public int setLength()
    {
        return length;
    }
    public double setX_Origin()
    {
        return x_Origin;
    }
    public double setY_Origin()
    {
        return y_Origin;
    }
    public double getPerimeter()
    {
        return length*side_Num;
    }
    public double getArea()
    {
        return (side_Num*(Math.pow(length, 2)))/
                (4*Math.tan(Math.PI/side_Num));
    }
    
    
}

class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
        
    //    polygon1.setNumSide(6);
     //   polygon1.setLength(4);
        

        System.out.println("polygon1 Perimeter: " + polygon1.getPerimeter());
        System.out.println("polygon1 Area: " + polygon1.getArea());
        
        System.out.println("polygon2 Perimeter: " + polygon2.getPerimeter());
        System.out.println("polygon2 Area: " + polygon2.getArea());
        
        System.out.println("polygon3 Perimeter: " + polygon3.getPerimeter());
        System.out.println("polygon3 Area: " + polygon3.getArea());
        
        
    }
}

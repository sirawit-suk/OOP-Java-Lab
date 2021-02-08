
public class LinearEquation {

    //Ans Variables
    private double x = 0;
    private double y = 0;
    
    //Calculate Variables
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double d = 0;
    private double e = 0;
    private double f = 0;
    
    //Constructors
    public LinearEquation() {}
    public LinearEquation(double a, double b, double c, double d, double e, double f) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    //Setter / Mutator
    public void setA(double a)
    {
        this.a = a;
    }
    public void setB(double b)
    {
        this.b = b;
    }
    public void setC(double c)
    {
        this.c = c;
    }
    public void setD(double d)
    {
        this.d = d;
    }
    public void setE(double e)
    {
        this.e = e;
    }
    public void setF(double f)
    {
        this.f = f;
    }
    
    //Getter / Accessor
    public boolean isSolvable()
    {
        double ans = (a*d) - (b*c); 
        if(ans != 0){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    //Getter / Accessor
    public double getX()
    {
        x = ((e*d)-(b*f))  /  ((a*d)-(b*c));
        return x;
    }
    public double getY()
    {
        y = ((a*f)-(e*c))  /  ((a*d)-(b*c));
        return y;
    }
    
    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }    
    public double getC()
    {
        return c;
    }
    public double getD()
    {
        return d;
    }    
     public double getE()
    {
        return e;
    }
    public double getF()
    {
        return f;
    }   
    
}

class TestLinearEquation {
    public static void main(String[] args) {
        
        LinearEquation Linear1 = new LinearEquation(3.4,50.2,2.1,0.55,44.5,5.9);
        if(Linear1.isSolvable() == false)
        {
            System.out.println("The equation has no solution");
        }
        else if(Linear1.isSolvable() == true)
        {
            System.out.println("Okey!");
            System.out.printf("%.2f \n",Linear1.getX());
            System.out.printf("%.2f",Linear1.getY());
        }

    }
}
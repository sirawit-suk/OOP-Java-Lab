package pop.computer.chapter9;

public class Rectangle {
    
    double base;
    double height;
    double area;
    
    Rectangle(){   
    }
    Rectangle(double newBase, double newHeight){
        base = newBase;
        height = newHeight;
    }
    
    double getArea(){
        return 1/2.0 * base * height;
    }
    
    
}

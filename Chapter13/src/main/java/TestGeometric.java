//abstract class = may or may not have abstract method;
//abstract method need to have abstract class;

//abstract class = used because class it's self can't make an object because it not complete

public class TestGeometric {
    public static void main(String[] args) throws CloneNotSupportedException {
        Geometric geo1;
        Geometric cir2 = new Circle(123);
        Rectangle rec3 = new Rectangle(100, 500);
        Rectangle rec4 = new Rectangle(200,1000);
        
        System.out.println(((Circle)cir2).getRadius());
        
        ComparableRectangle compare1 = new ComparableRectangle(rec3.getWidth(),rec3.getHeight());
        ComparableRectangle compare2 = new ComparableRectangle(rec4.getWidth(),rec4.getHeight());
        
        System.out.println(compare1.compareTo(compare2));
        System.out.println(compare2.compareTo(compare1));
     
        System.out.println(compare1.compareTo(compare1));
        
        ComparableRectangle compare0 = (ComparableRectangle) compare1.clone();
        System.out.println(compare0.compareTo(compare2));
        System.out.println(compare2.compareTo(compare0));
     
        System.out.println(compare0.compareTo(compare0));
        System.out.println(compare0 == compare2);
        
        //System.out.println(cir2.getArea() + "square meters");
      
        
        
    }
}

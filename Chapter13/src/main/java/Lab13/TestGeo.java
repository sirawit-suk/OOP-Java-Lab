
package Lab13;

public class TestGeo {
    
    public static void main(String[] args) {
        
        Rectangle rec1 = new Rectangle(5, 10);
        Rectangle rec2 = new Rectangle(5, 20);
        
        Circle cir1 = new Circle(5);
        Circle cir2 = new Circle(10);

        
        System.out.println(GeometricObject.max(rec1,rec2));
        System.err.println(GeometricObject.max(cir1, cir2));
        System.err.println(GeometricObject.max(cir1, rec2));
        
        rec1.howToColor();
        cir1.howToColor();
        
    }
}

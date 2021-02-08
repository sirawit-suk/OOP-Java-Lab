package pop.computer.chapter9;

public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.isIsFilled());
        Circle c2 = new Circle(2.5, "Red", true);
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
        System.out.println(c2.isIsFilled());

        System.out.println(c1.toString());

        Circle[] arrayCircle = new Circle[10];
        for (int i = 0; i < arrayCircle.length; i++) {
            arrayCircle[i] = new Circle(10,"Red",true);
        }
        
        System.out.println("WTF : " + getTotalArea(arrayCircle));
        
    }
    
    public static double getTotalArea(Circle[] c){
        double totalArea = 0;
        for (Circle circle : c) {
            totalArea += circle.getArea();
        }
        return totalArea;
    }
    
}

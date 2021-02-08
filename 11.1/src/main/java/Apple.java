
public class Apple extends Fruit{
    public static void main(String[] args) {
        Apple a = new Apple();
    }

    public Apple() {
        super("WTF");
    }
    
}

class Fruit {
    Fruit(String s)
    {
        System.out.println(s);
    }
}
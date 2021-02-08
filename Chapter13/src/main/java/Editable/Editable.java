
package Editable;

public interface Editable {
    String howToEat();
}

abstract class Fruit implements Editable{
     
}
class Orange extends Fruit{

    @Override
    public String howToEat() {
         return "make orange juice";
    }   
}
class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "make pie apple";
    }   
}

abstract class Animal {
    abstract String sound();
}
class Chicken extends Animal implements Editable{
    
    @Override
    public String howToEat() {
        return "Go to KFC";
    }
    
    @Override
    String sound(){
        return "Ek E Ek";
    }
    
}
class Tiger extends Animal{

    @Override
    String sound() {
        return "Roarrrr";
    }
    
}

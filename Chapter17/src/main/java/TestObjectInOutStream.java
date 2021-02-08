
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sirawit
 */
public class TestObjectInOutStream {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("binary4.dat")); 
        out.writeUTF("Areeya");
        out.writeChar('F');
        out.writeObject(new Date());
        Circle c1 = new Circle(2.5);
        System.out.println("c1 area:" + c1.getArea());
        out.writeObject(c1);
        out.close();
        System.out.println("finish writing object");
        
        System.out.println("start reading object");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("binary4.dat")); 
        System.out.println("name:" + in.readUTF());
        System.out.println("gender:" + in.readChar());
        System.out.println("date:" + in.readObject());
        Circle c2 = null;
        c2 = (Circle) in.readObject();
        System.out.println("c2 area:" + c2.getArea());
        System.out.println("finish reading file");
    }
}

class Circle implements Serializable{
    double radius;
    static int numberOfObjects;
    transient SpecialCircle sc = new SpecialCircle();
    //it must be transient... before...
    //if not... then Special Circle must implement Serializable
    
    Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
}
class SpecialCircle {
    
}

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sirawit
 */
public class TestDataInOutStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("binary2.dat");
        DataOutputStream out = new DataOutputStream(fos);
        out.writeUTF("sirawit");
        out.writeInt(45);
        out.writeDouble(174.5);
        out.writeChar('m');
        out.close();
        System.out.println("finish writing file");
    
        System.out.println("start readiing file");
        DataInputStream in = new DataInputStream(new FileInputStream("binary2.dat"));
        System.out.println("file size:" + in.available());
        System.out.println("Name: " + in.readUTF());
        System.out.println("Age: " + in.readInt());
        System.out.println("Height: " + in.readDouble());
        System.out.println("Gender: " + in.readChar());
        System.out.println("file size at the end: " + in.available());
        in.close();
        System.out.println("finish reading file");
    }
}

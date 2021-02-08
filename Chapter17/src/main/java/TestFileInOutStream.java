/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Sirawit
 */
public class TestFileInOutStream {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileOutputStream out = new FileOutputStream("binary1.dat");
        for (int i = 0; i < 10; i++) {
            out.write(i);
            out.write(123);
            out.write(010);
            
        }
        out.close();
        
        
        System.out.println("finish writing file");
        System.out.println("start reading file");
        
        FileInputStream in = new FileInputStream("binary1.dat");
        int n;
        while(in.available()!=0)
        {
            System.out.println(in.read());
        }
        System.out.println("finish reading file");
        
    }
}

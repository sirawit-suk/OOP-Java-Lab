package com.mycompany.testfirsttime;

import java.util.Date;
import java.util.Scanner;

// CLASS BIG LETTER
// object small letter

public class TestForFirstTime {

        
    
    public static void main(String[] args) {

        Date date = new Date();
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please input integer: ");
//        int num1 = input.nextInt();
//        System.out.println(num1);
//        
//        System.out.print("Please input double: ");
//        double d1 = input.nextDouble();
//        System.out.println(d1);
//        
//        float f1 = 1.24f;
//        boolean b = 1>2;
//        System.out.println(b);

        double rand = Math.random();                  // Math.random();
        System.out.println(rand);                      // For 0.0 - 0.9
        int n = (int)(rand * 10);                     // For 0.0 - 9.0
        System.out.println(n);                                 // For 0-9
        
        n = (int)(rand * 6);           // For range = 6 // 0-5
        System.out.println(n + "\n");
        
        for (int i = 0; i<5; i++) {
            rand = Math.random();
            System.out.println(rand + " ");
        }
        for (int i = 0; i<5; i++) {
            rand = Math.random();
            System.out.print(rand + " "); 
            n = (int)(rand * 31)+15;           // For range = Max - Min +1 = 45-15 = 30 +1  // 15-45        
            System.out.println(n);
        }
        
        String name = "Sirawit";
        System.out.println((int)name.charAt(0)+" "+(int)name.charAt(1));
        System.out.println("A"+1+1);

        int a = Integer.parseInt("1234");
        System.out.println(a + Integer.parseInt("1234"));
        
        double c = 2000+(int)(Math.random()*3000);
        System.out.println(c/100);
        System.out.println(c/100.0);
        
        int[] arrayOfNumber = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arrayOfNumber[i] = i;
            System.out.println(arrayOfNumber[i]);
        }
 
        System.out.println(date);
        
        
        //n = 30+(int)(Math.random()*10);  
        //System.out.println(n);
        
        
//        String s1 = "Welcome to Java";
//        System.out.println(s1);
//            String s2;
//            Scanner input = new Scanner(System.in);
//            System.out.println("enter a string:");
//            s2 = input.nextLine();
//            System.out.println(s2);
//           
//            System.out.println(s2.length());
//            System.out.println(s2.charAt(0));
//            System.out.println(s2.charAt(1));
//        
//           String s3 = "500";                           // Interger.parseInt();
//           int n2 = Integer.parseInt(s3);
//           System.out.println(n2+200);
//           System.out.println(s3+200);
//           
//           String text = n2 + "600" + 200;
//           int n3 = Integer.parseInt(text);
//           System.out.println(n3);

//        int[] a;
//        a = new int[10];
//        
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i;
//        }
//     
//        for (int i : a) {   //for each
//            System.out.println(a[i]);
//        }
//        int[][] arr3 = {{1, 2, 3},
//                        {1},
//                        {1, 2},
//                        {1, 2, 3, 4}
//                       };
//        System.out.print("{");
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print("{");
//            for (int j = 0; j < arr3[i].length; j++) {
//                System.out.print(arr3[i][j]);
//                if(j != arr3[i].length-1){
//                    System.out.print(",");
//                }
//              
//            }
//            System.out.println("}");
//        }
//        System.out.println("}");
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class TestFileClass {
    
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("TestText.txt");
        System.out.println(file.exists());
        
        try(PrintWriter output = new PrintWriter(file)){
            output.print("TEESSSSSST");
        }
        System.out.println("OKEY");
        
        /*
        Scanner input = new Scanner(file);
        
        ArrayList<String> list = new ArrayList<>();
        while (input.hasNext()){
            list.add(input.next());
        }
        input.close();
        for (String a : list) {
            System.out.println(a);
        }

        */
    }
}

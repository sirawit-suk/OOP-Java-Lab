import java.util.Date;

public class TestSystem {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        System.out.println(date);
        
        Course course1 = new Course("Object Oriented Programming", "010901239");
        
        Student student1 = new Student("Sirawit", "62010948");
        Student student2 = new Student("Anuchit", "62010949");
        Student student3 = new Student("Visanu", "62010950");     
        
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        
        System.out.println(course1);
       
        course1.dropStudent(student3);
        
        System.out.println(course1.toString());
        
    }
    
}

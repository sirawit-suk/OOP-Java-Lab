
import java.time.LocalDateTime;

public class TestCourse {
    public static void main(String[] args) {
        
        Student s1 = new Student("62010948","Sirawit");
        s1.setDob(LocalDateTime.of(2001,3,8,16,45));
        System.out.println(s1.toString());
        
        Course c1 = new Course("0109872","OOP");
        s1.addCourse(c1);
        System.out.println(s1.toString());
    }
}

public class TestSystem {
    
    public static void main(String[] args) {
        
        Course course1 = new Course("Object Oriented Programming", "010901239");
        
        course1.addStudent("Sirawit","62010948");
        course1.addStudent("Anuchit","62010949");
        course1.addStudent("Peerapat","62010950");
        
        System.out.println(course1.toString());
       
        course1.dropStudent("A");
        
        System.out.println(course1.toString());
        
    }
    
}

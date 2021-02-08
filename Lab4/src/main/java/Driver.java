
public class Driver {
    
    public static void main(String[] args) {
         
        AssignmentList a1 = new AssignmentList();
        
        Assignment b1 = new Assignment("A", 12, 1, 23, 0);
        Assignment b2 = new Lab("B", 12, 1, 23, 0, "LAB 1");
        Assignment b3 = new Project("C", 12, 1, 23, 0, "PROJECT 1", "ESL.pdf");
        
        b1.setScore(0.78);
        b1.setTotalPoints(0.99);
        b1.setTotalWeight(0.3);
        
        b2.setScore(0.78);
        b2.setTotalPoints(0.99);
        b2.setTotalWeight(0.3);
        
        b3.setScore(0.78);
        b3.setTotalPoints(0.99);
        b3.setTotalWeight(0.3);
        
        a1.addItem(b1);
        a1.addItem(b2);
        a1.addItem(b3);
        
        System.out.println(a1.toString());
        System.out.printf("%.2f",a1.computeCourseGrade());
        
    }
}

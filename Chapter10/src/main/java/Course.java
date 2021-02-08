
public class Course {
    // courseId, courseName, credit, courseDescription
    
    private int credit;
    private String courseId;
    private String courseName = "N/A";
    private String courseDescription;

    public Course() {}
    public Course(String courseId, String courseName) 
    {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    public String getName()
    {
        return courseName;
    }
    
}

import java.time.LocalDateTime;

public class Student {
   
    private String id = "";
    private String name = "";
    private LocalDateTime dob;
    private Course[] course = new Course[7]; //create slot 3-7 
    private int count = 0;

    public Student() {}
    public Student(String id, String name) 
    {
        this.id = id;
        this.name = name;
        
        //Create new course...
        for (int i = 0; i < course.length; i++) {
            course[i] = new Course();
        }
    }
    
    public void addCourse(Course newCourse)
    {
        //check available array
        course[count] = newCourse;
        count++;
    }
    public String displayCourse()
    {
        String s = "";
        for (int i = 0; i < course.length; i++) {
            s += course[i].getName() + ',';
        }
        return s;
    }

    //DoB
    public LocalDateTime getDob() 
    {
        return dob;
    }
    public void setDob(LocalDateTime dob)
    {
        this.dob = dob;
    }

    //ID
    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    //Name
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", course=" + displayCourse() + ", count=" + count + '}';
    }

    
   
    
    
    
}

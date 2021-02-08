public class Course {
    
    //Course
    private String name = "N/A";
    private String id = "00000000";
    
    //Student
    private String[] students_name = new String[40];
    private String[] students_id = new String[40];
    private int numberOfStudents = 0;
    

    public Course(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }
    
    public void addStudent(String students_name, String students_id)
    {
        this.students_name[numberOfStudents] = students_name;
        this.students_id[numberOfStudents] = students_id;
        numberOfStudents++;
    }
  
    public void dropStudent(String student_name)   //UnderConstuction
    {
        for (int i = 0; i < numberOfStudents; i++) {
            if(students_name[i].contentEquals(student_name))
            {
                 students_name[i] = students_name[numberOfStudents-1];
                 students_id[i] = students_id[numberOfStudents-1];
                 students_name[numberOfStudents-1] = "";
                 students_id[numberOfStudents-1] = "";
                 numberOfStudents--;
                 break;
            }
            else if((i == numberOfStudents-1) && !(students_name[i].contentEquals(student_name)))
            {
                System.out.println("Error, Not found your name.");
            }
        }
    }
    
    public String displayAllStudent()
    {
        String n = "";
        for (int i = 0; i < numberOfStudents; i++) {
            n += getStudent_name(i) + " " + getStudent_id(i) + ", ";
        }
        return n;
    }
    
    public String getStudent_name(int i)    
    {
        return students_name[i];
    }
    public String getStudent_id(int i)    
    {
        return students_id[i];
    }
    
    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }
    
    public String getCourseName()
    {
        return name;
    }

    /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numberOfStudents;i++){
            sb.append("\n" +students_name[i] + " " + students_id[i]);
        }
        
        return "Course{" + "name = " + name + ", id = " + id + ", \n students_name = " + sb.toString() + ", numberOfStudents = " + numberOfStudents + '}';
    }
    */

    @Override
    public String toString() {
        return "Course{" + "name = " + name + ", id = " + id + ", student name = " + displayAllStudent() + "numberOfStudents = " + numberOfStudents + '}';
    }
    
    
    
}

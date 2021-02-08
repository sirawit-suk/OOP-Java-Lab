public class Course {
    
    //Course
    private String name = "N/A";
    private String id = "00000000";
    
    //Student
    private Student[] studentArray = new Student[100];
    private int numberOfStudents = 0;
    

    public Course(String name, String id) 
    {
        this.name = name;
        this.id = id;
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student();
        }
    }
    
    public void addStudent(Student student)
    {
        studentArray[numberOfStudents] = student;
        numberOfStudents++;
    }
  
    public void dropStudent(Student student)   //UnderConstuction
    {
        for (int i = 0; i < numberOfStudents; i++) {
            if(studentArray[i] == student)
            {
                 studentArray[i] = studentArray[numberOfStudents-1];
                 studentArray[numberOfStudents-1] = null;
                 numberOfStudents--;
                 break;
            }
            else if((i == numberOfStudents-1) && !(studentArray[i] == student))
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
        return studentArray[i].getName();
    }
    public String getStudent_id(int i)    
    {
        return studentArray[i].getId();
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

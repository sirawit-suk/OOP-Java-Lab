public class Student {
    
    private String name = "N/A";
    private String id = "00000000";

    public Student() {}
    public Student(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name; 
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    
    
}

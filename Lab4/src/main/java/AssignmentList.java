import java.util.ArrayList;


public class AssignmentList {
    
    private ArrayList<Assignment> itemList = new ArrayList<Assignment>();

    public AssignmentList() { 
    }

    public void addItem(Assignment newitem)
    {
        itemList.add(newitem);
    }
    public double computeCourseGrade()
    {
        double firstLine = 0;
        double secondLine = 0;
        for (Assignment assign : itemList) {
            firstLine += assign.getTotalWeight()*assign.getScore()/assign.getTotalPoints();
        }
        for (Assignment assign : itemList) {
            secondLine += assign.getTotalWeight();
        }
        
        return firstLine/secondLine;
    }

    @Override
    public String toString() {
        return "This is itemList ->\n"+ itemList;
    }
    

}

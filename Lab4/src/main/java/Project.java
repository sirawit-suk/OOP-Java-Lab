
public class Project extends Assignment{
    
    private String specification;
    private String dataFile;

    public Project(String name, int month, int day, int hour, int minute, String specification, String dataFile) {
        super(name, month, day, hour, minute);
        this.specification = specification;
        this.dataFile = dataFile;
    }
     
    @Override
    public String getName()
    {
        return "WTF";
    }

    @Override
    public String toString() {
        return "\n name " + getName() + " (date: " + getMonth()+'-'+getDay() + " at " + getHour() + ':' + getMinute() + "): score = " + getScore() +"; totalPoints = " + getTotalPoints() + "; totalWeight = " + getTotalWeight() + "; Specification = "+ specification + "; DataFile = "+ dataFile+"}";
    }
    
    
    
}

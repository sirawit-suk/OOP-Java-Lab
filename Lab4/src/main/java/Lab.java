
public class Lab extends Assignment{
    private String specification;

    public Lab(String name, int month, int day, int hour, int minute, String specification) {
        super(name, month, day, hour, minute);
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "\n name " + getName() + " (date: " + getMonth()+'-'+getDay() + " at " + getHour() + ':' + getMinute() + "): score = " + getScore() +"; totalPoints = " + getTotalPoints() + "; totalWeight = " + getTotalWeight() + "; Specification = "+ specification +"}";
    }
    
    
    
}

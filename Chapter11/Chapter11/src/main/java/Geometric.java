import java.util.Date;

public class Geometric {
    private String color;
    private boolean isFilled;
    private Date datecreated;

    public Geometric() {
        datecreated = new Date();
    }

    public Geometric(String color, boolean isFilled, Date datecreated) {
        this.color = color;
        this.isFilled = isFilled;
        this.datecreated = datecreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", isFilled=" + isFilled + ", datecreated=" + datecreated + '}';
    }
   
    
    
    
}

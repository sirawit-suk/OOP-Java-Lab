public class ComparableRectangle extends Rectangle
implements Comparable<ComparableRectangle>, Cloneable{

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }
    
    
    @Override
    public int compareTo(ComparableRectangle o) {
        if(getArea() > o.getArea()) return +1;
        else if(getArea() < o.getArea()) return -1;
        else return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    
}
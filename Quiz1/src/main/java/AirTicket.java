
public class AirTicket {

    private String plane1 = "First Class";
    private String plane2 = "Business Class";
    private String plane3 = "Economy Class";
    private String planeSelect = "N/A";
    
    private int cost = 0;
    
    public AirTicket() {
    }
    public void setPlane(int i)
    {
         switch(i)
        {
            case 1: planeSelect = plane1;
                    cost = 100000;
                    break;
            case 2: planeSelect = plane2;
                    cost = 50000;
                    break;
            case 3: planeSelect = plane3;
                    cost = 20000;
                    break;
            default: System.out.println("Please choose again...");
        }
    }
    
    public void displayCost()
    {
        System.out.println("You have been select " + planeSelect);
        System.out.println("Now, Cost of AirTicket = " + cost + " bahts");
    }

    public int getCost() {
        return cost;
    }
    
    
    
    
    
}

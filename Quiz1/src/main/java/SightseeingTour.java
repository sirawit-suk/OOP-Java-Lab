
public class SightseeingTour {
    
    private String tour1 = "Tour1";
    private String tour2 = "Tour2";
    private String tour3 = "Tour3";
    private String tourSelect = "N/A";
    
    private int cost = 0;
    
    public SightseeingTour() {
    }
    public void setTour(int i)
    {
         switch(i)
        {
            case 1: tourSelect = tour1;
                    cost = 4000;
                    break;
            case 2: tourSelect = tour2;
                    cost = 3000;
                    break;
            case 3: tourSelect = tour3;
                    cost = 2000;
                    break;
            default: System.out.println("Please choose again...");
        }
    }
    
    public void displayCost()
    {
        System.out.println("You have been select " + tourSelect);
        System.out.println("Now, Cost of Tour = " + cost + " bahts");
    }

    public int getCost() {
        return cost;
    }
}

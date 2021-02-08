
public class Hotel {
    private String hotel1 = "5 Stars Hotel";
    private String hotel2 = "4 Stars Hotel";
    private String hotel3 = "3 Stars Hotel";
    private String hotelSelect = "N/A";
    
    private int cost = 0;

    public Hotel() {
    }
    public void setHotel(int i)
    {
         switch(i)
        {
            case 1: hotelSelect = hotel1;
                    cost = 30000;
                    break;
            case 2: hotelSelect = hotel2;
                    cost = 20000;
                    break;
            case 3: hotelSelect = hotel3;
                    cost = 10000;
                    break;
            default: System.out.println("Please choose again...");
        }
    }
    
    public void displayCost()
    {
        System.out.println("You have been select " + hotelSelect);
        System.out.println("Now, Cost of Hotel = " + cost + " bahts");
    }

    public int getCost() {
        return cost;
    }
    
    
    
    
    
    
    
}

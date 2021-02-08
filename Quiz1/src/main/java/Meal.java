
public class Meal {
    
    private String meal1 = "Hotel Meal";
    private String meal2 = "Restaurant Meal";
    private String meal3 = "Street Meal";
    private String mealSelect = "N/A";
    
    private int numberOfMeal = 0;
    
    private int cost = 0;
    private int total = 0;
    
    public Meal() {
    }
    public void setMeal(int i)
    {
         switch(i)
        {
            case 1: mealSelect = meal1;
                    cost = 8000;
                    break;
            case 2: mealSelect = meal2;
                    cost = 6000;
                    break;
            case 3: mealSelect = meal3;
                    cost = 3000;
                    break;
            default: System.out.println("Please choose again...");
        }
    }
    
    public void setNumberOfMeal(int i)
    {
        numberOfMeal = i;
    }
    
    public void displayCost()
    {
        total = cost * numberOfMeal; 
        System.out.println("You have been select " + mealSelect);
        System.out.println("Cost of Meal = " + cost + " bahts");
        System.out.println("Number of meal " + numberOfMeal);
        System.out.println("Now, Cost of All Meal = " + total + " bahts");
    }

    public int getCost() {
        return total;
    }
}

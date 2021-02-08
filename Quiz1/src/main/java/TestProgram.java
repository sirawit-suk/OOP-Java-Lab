
import java.util.Scanner;


public class TestProgram {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int choice2 = 0;
        
        AirTicket airTicket1 = new AirTicket();
        Hotel hotel1 = new Hotel();
        Meal meal1 = new Meal();
        SightseeingTour tour1 = new SightseeingTour();
        
        
        System.out.println("Welcome to Website Japan Tour Co.");
        System.out.println("This is a calculator program who want to visit japan!");
        
        while (choice != 7) {            
            System.out.println("We need you to choose which package do you want to edit?");
            System.out.println("1. AirTicket");
            System.out.println("2. Hotel");
            System.out.println("3. Meal");
            System.out.println("4. Number of Meal");
            System.out.println("5. SightseeingTour");
            System.out.println("6. See All package info");
            System.out.println("7. Close the Program");
            choice = input.nextInt();
       
            switch(choice){
                case 1: 
                    System.out.println("We need you to choose which AirTicket do you want?");
                    System.out.println("1. First Class : 100000 bahts");
                    System.out.println("2. Business Class : 50000 bahts");
                    System.out.println("3. Economy Class : 20000 bahts");
                    System.out.println("Please select the number 1-3...");
                    choice2 = input.nextInt();  //Select 

                    airTicket1.setPlane(choice2); //Set
                    airTicket1.displayCost(); //Display cost
                    
                    input.nextLine();
                    System.out.println("Please Enter to continue...");  //System run 
                    input.nextLine();
                    
                    break;
                case 2:
                    System.out.println("We need you to choose which Hotel do you want?");
                    System.out.println("1. 5 Stars Hotel : 30000 bahts");
                    System.out.println("2. 4 Stars Hotel : 20000 bahts");
                    System.out.println("3. 3 Stars Hotel : 10000 bahts");
                    System.out.println("Please select the number 1-3...");
                    choice2 = input.nextInt();  //Select 

                    hotel1.setHotel(choice2); //Set
                    hotel1.displayCost(); //Display cost
                    
                    input.nextLine();
                    System.out.println("Please Enter to continue...");  //System run 
                    input.nextLine();
                    break;
                case 3:
                    System.out.println("We need you to choose which Meal do you want?");
                    System.out.println("1. Hotel Meal : 8000 bahts");
                    System.out.println("2. Restaurant Meal : 6000 bahts");
                    System.out.println("3. Street Meal : 3000 bahts");
                    System.out.println("Please select the number 1-3...");
                    choice2 = input.nextInt();  //Select 

                    meal1.setMeal(choice2); //Set
                    meal1.displayCost(); //Display cost
                    
                    input.nextLine();
                    System.out.println("Please Enter to continue...");  //System run 
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("We need you to choose Number of Meal do you want?");
                    System.out.println("Please select the number 1-8...");
                    choice2 = input.nextInt();  //Select 

                    meal1.setNumberOfMeal(choice2); //Set
                    
                    input.nextLine();
                    System.out.println("Please Enter to continue...");  //System run 
                    input.nextLine();
                    break;                    
         
                case 5:
                    System.out.println("We need you to choose which Tour do you want?");
                    System.out.println("1. Tour1 : 4000 bahts");
                    System.out.println("2. Tour2 : 3000 bahts");
                    System.out.println("3. Tour3 : 2000 bahts");
                    System.out.println("Please select the number 1-3...");
                    choice2 = input.nextInt();  //Select 

                    tour1.setTour(choice2); //Set
                    tour1.displayCost(); //Display cost
                    
                    input.nextLine();
                    System.out.println("Please Enter to continue...");  //System run 
                    input.nextLine();
                    break;
                     
                case 6:
                    System.out.println("");
                    System.out.println("Now.. This is your package");
                    airTicket1.displayCost();
                    System.out.println("");
                    hotel1.displayCost();
                    System.out.println("");
                    meal1.displayCost();
                    System.out.println("");
                    tour1.displayCost();
                    System.out.println("");
                    int total = airTicket1.getCost() + hotel1.getCost() + meal1.getCost() + tour1.getCost();
                    System.out.println("Total cost : " + total + "Bahts");
                    
                    input.nextLine();
                    System.out.println("Please Enter to continue...");  //System run 
                    input.nextLine();
                    break;
                case 7:
                    break;
                default : System.out.println("Please select again...");

            }
        }
        
        
        
        
       
        
    }
}

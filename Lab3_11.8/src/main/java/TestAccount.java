import java.util.ArrayList;
import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        
        int choice = -1;
        
        Scanner input = new Scanner(System.in);
        Account a1 = new Account();
     
        while(choice != 4)
        {
            
            switch(choice)
            {
                case -1:
                    System.out.print("Enter an Name: ");
                    a1.setName(input.nextLine());
                    System.out.print("Enter an id: ");
                    a1.setId(input.nextInt());
                    a1.setAnnualInterestRate(1.5);      

                    choice = 0;
                    break;
                
                
                case 0:
                    System.out.println("1: check balance"); 
                    System.out.println("2: withdraw");
                    System.out.println("3: deposit");
                    System.out.println("4: exit");
                    System.out.println("Enter a choice: ");
                    choice = input.nextInt();
                    input.nextLine();
                    break;
                
                
                case 1:
                    System.out.println(a1.getDate());
                    a1.printTransaction();
                    System.out.println("Please Enter to continue: ");
                    input.nextLine();
                    choice = 0;
                    break;
                
                
                case 2:
                    System.out.print("Enter an amount to withdraw (can be 2 digits): ");
                    double wit = input.nextDouble();
                    a1.withdraw(wit);
                    System.out.println("The balance of id:" + a1.getId() + " is " + a1.getBalance());
                    input.nextLine();
                    System.out.println("Please Enter to continue: ");
                    input.nextLine();
                    choice = 0;

                    break;
                
                
                case 3:
                    System.out.print("Enter an amount to deposit (can be 2 digits): ");
                    double dep = input.nextDouble();
                    a1.deposit(dep);
                    System.out.println("The balance of id:" + a1.getId() + " is " + a1.getBalance());
                    input.nextLine();
                    System.out.println("Please Enter to continue: ");
                    input.nextLine();
                    choice = 0;
                    break;
                
                
                case 4:
                    break;
                
                
                default: 
                    System.out.println("Please try again...");
                    choice = 0;
            }
        }
       
    }      

}

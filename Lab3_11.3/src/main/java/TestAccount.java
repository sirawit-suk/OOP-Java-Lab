import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        
        int choice = -1;
        int choice2 = 0; 
        
        int tempId;
        String tempName;
        double balance = 0;
        
        Scanner input = new Scanner(System.in);
        Account a1 = new Account();
     
        while(choice != 4)
        {      
            switch(choice)
            {
                case -1:
                    System.out.print("Enter an Name: ");
                    tempName = input.nextLine();
                    System.out.print("Enter an id: ");
                    tempId = input.nextInt();     
                    
                    System.out.println("choose your account: ");
                    System.out.println("1 : Saving Account");
                    System.out.println("2 : Checking Account");
                    System.out.println("3 : Privileged Account");
                    choice2 = input.nextInt();   
                    switch(choice2){
                        case 1: a1 = new SavingAccount(tempName,tempId,0);
                        System.out.println("Now, You select Saving Account");
                        choice = 0;
                            break;
                        case 2: a1 = new CheckingAccount(tempName,tempId,0);
                        System.out.println("Now, You select Checking Account");
                        choice = 0;
                            break;
                        case 3: a1 = new PriviledgedAccount(tempName,tempId,0);
                        System.out.println("Now, You select Priviledged Account");
                        choice = 0;
                            break;
                        default: 
                        System.out.println("Please choose again...");
                    }
                    input.nextLine();
                    System.out.println("Please Enter to continue: ");
                    input.nextLine();
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
                    a1.withdraw(wit,"-");
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

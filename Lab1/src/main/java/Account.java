import java.util.Date;
import java.util.Scanner;

public class Account {
    
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;
    
    //Constuctor 
    Account(){
    }
    Account(int id, double balance ){
      this.id = id;
      this.balance = balance;
    }
    
    //Setter / Mutator
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate/100.0;
    }
    
    //Getter / Accesser
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    } 
    public Date getDate(){
        dateCreated  = new Date();
        return dateCreated;
    }
    
    //Specific Getter / Accester
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate/12.0;
        return monthlyInterestRate;
    }
    public double getMonthlyInterest(){
        double monthlyInterestRate = annualInterestRate/12.0;
        return balance * monthlyInterestRate;
    }   
    
    //withdraw / deposit
    public void withdraw(double balance){
        this.balance -= balance;
    }
    public void deposit(double balance){
        this.balance += balance;
    }
    
}

class TestAccount {
    public static void main(String[] args) {
        
        int choice = -1;
        
        Scanner input = new Scanner(System.in);
        
        Account a1 = new Account(0000,20000);
//        a1.setAnnualInterestRate(4.5);
    
//        a1.withdraw(2500);
        a1.deposit(5000);
        
//        System.out.println(a1.getId());
//        System.out.println(a1.getBalance());
//        System.out.println(a1.getMonthlyInterest());
//        System.out.println(a1.getDate());
     
       

        while(choice != 4)
        {
            
            switch(choice)
            {
                case -1:
                    System.out.print("Enter an id: ");
                    a1.setId(input.nextInt());
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
                    System.out.println("The balance of id:" + a1.getId() + " is " + a1.getBalance());
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
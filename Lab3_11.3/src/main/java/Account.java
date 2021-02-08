import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Account {
    
    private String name ="";
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 1.5;
    private Date dateCreated;
    
    ArrayList<Transaction> trans= new ArrayList<>();
    
    //Constuctor 
    Account(){
    }
    Account(String name,int id, double balance){
      this.name = name;
      this.id = id;
      this.balance = balance;
    }
    
    //Setter / Mutator
    public void setName(String name){
        this.name = name;
    }
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
    public String getName(){
        return name;
    }
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
    public void withdraw(double amount,String s){
        this.balance -= amount;
        Transaction bill = new Transaction('W',amount,balance,s);
        trans.add(bill);
    }
    public void deposit(double amount){
        this.balance += amount;
        Transaction bill = new Transaction('D',amount,balance,"-");
        trans.add(bill);
    }
    
    public void printTransaction(){
        System.out.println(trans.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "name = " + name + ", id = " + id + ", balance = " + balance + ", annualInterestRate = " + annualInterestRate + ", dateCreated = " + dateCreated;
    }

}
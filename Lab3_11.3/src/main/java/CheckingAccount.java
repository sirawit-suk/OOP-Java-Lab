
public class CheckingAccount extends Account{

    public CheckingAccount() {
    }
    public CheckingAccount(String name, int id, double balance) {
        super(name, id, balance);
        super.setAnnualInterestRate(0);
    }

    @Override
    public void withdraw(double amount,String s) {
        if(amount+20 <= super.getBalance())
        {
            super.withdraw(amount+20,"fee 20 bahts"); //To change body of generated methods, choose Tools | Templates.
        }
        else
        {
            System.out.println("Unable to withdraw your money, Please try again!");
        }
        
        
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + super.toString() + '}';
    }
   
    
    
}

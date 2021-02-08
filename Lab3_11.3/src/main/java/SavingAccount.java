
public class SavingAccount extends Account{

    public SavingAccount() {
    }

    public SavingAccount(String name, int id, double balance) {
        super(name, id, balance);
    }

    
    @Override
    public void withdraw(double amount, String s) {
        if(amount <= super.getBalance())
        {
            super.withdraw(amount,"-"); //To change body of generated methods, choose Tools | Templates.
        }
        else
        {
            System.out.println("Unable to withdraw your money, Please try again!");
        }
    }

    @Override
    public String toString() {
        return "SavingAccount{" + super.toString() +'}';
    }
    
    
    
    
}

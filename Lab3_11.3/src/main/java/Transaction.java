

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        //date = new GrogorianCalendar;
    }

    @Override
    public String toString() {
        return "Transaction{ " + "type = " + type + ", amount = " + amount + ", balance = " + balance + ", description = " + description + "}\n";
    }

    
  
}

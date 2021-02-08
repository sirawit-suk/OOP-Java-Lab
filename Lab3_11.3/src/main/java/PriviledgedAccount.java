
public class PriviledgedAccount extends Account{

    public PriviledgedAccount() {
    }
    public PriviledgedAccount(String name, int id, double balance) {
        super(name, id, balance);
    }
    

    @Override
    public String toString() {
        return "PriviledgedAccount{" + super.toString() + '}';
    }
    
    
    
}

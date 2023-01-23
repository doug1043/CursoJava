public class Account {

    private String name;

    private double balance;

    // constructor initializes name with parameter name
    public Account(String name, double balance) { 
        // constructor name is class name
        this.name = name;
        if(balance < 0){
            this.balance = 0;
        }
        else{
            this.balance = balance;
        }
        
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void depositValue(double deposit){
        if(deposit > 0){
            this.balance += deposit;
        }
        else{
            this.balance += 0;
        }
        
    }

    public void withdrawBalance(double draw){
        if(draw > 0 && draw <= this.balance){
            this.balance -= draw;
        }
        else{
            System.out.print("Valor de saque excede o saldo da conta ou é nulo%n%n");
        }
    }

}

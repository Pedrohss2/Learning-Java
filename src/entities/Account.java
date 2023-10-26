package entities;

public class Account {

    private int numberAccount;
    private String name;
    private  double balance;


    public Account() {
        super();
    }

    public Account(int numberAccount, String name){
        this.numberAccount = numberAccount;
        this.name = name;

    }

    public Account(int numberAccount, String name, double balance){
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    @Override
    public  String toString() {
        return "Account " +
                numberAccount +
                ", Holder " +
                name + ", " +
                "Balance: $ " +
                String.format("%.2f%n", balance);
    }
}


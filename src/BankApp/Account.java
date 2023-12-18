package BankApp;

public class Account {
    private String name;
    private String password;
    private double balance;

    public Account (String name, String password, double balance){
        this.setName(name);
        this.setPassword(password);
        this.setBalance(balance);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void withdrawal(double amount) {
        if (this.balance < 0) {
            System.out.println("You don't have enough money to withdraw");
        }else {
            this.balance -= amount;
            System.out.println("Your new balance is: " + this.balance);
        }
    }


}

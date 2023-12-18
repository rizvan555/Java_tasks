package BankApp;

public class Main {
public static void main(String[] args) {
    ATM atm = new ATM();
    Account account = new Account("Rizvan", "1234", 10000);

    atm.run(account);
    System.out.println("Go out of the ATM");

    }
}

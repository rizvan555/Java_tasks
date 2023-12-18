package BankApp;

import java.util.Scanner;

public class ATM {
    public void run(Account account){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank App");
        System.out.println("************************");

        System.out.println("Login to your account");
        System.out.println("************************");

        int loginAttempt = 3;

        while (true){
            if(login.login(account)){
                System.out.println("Login successful");
                break;
            }else {
                System.out.println("Login failed");
                loginAttempt--;
                System.out.println("You have " + loginAttempt + " login attempts left");
            }
            if (loginAttempt == 0){
                System.out.println("You have used all your login attempts");
                return;
            }
        }
        System.out.println("************************");

        String operations = "1.Balance\n"
                + "2.Deposit\n"
                + "3.Withdrawal\n"
                + "Press q to exit";

        System.out.println(operations);
        System.out.println("************************");

        while (true){
            System.out.println("Choose an operation");
            String operation = scanner.nextLine();

            if (operation.equals("q")){
                break;
            }else if (operation.equals("1")){
                System.out.println("Your balance is: " + account.getBalance());
            }else if (operation.equals("2")){
                System.out.println("Enter the amount you want to deposit");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                account.deposit(amount);
            }else if (operation.equals("3")){
                System.out.println("Enter the amount you want to withdraw");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                account.withdrawal(amount);
            }else {
                System.out.println("Invalid operation");
            }
}}
}

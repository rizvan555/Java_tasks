package BankApp;

import java.util.Scanner;

public class Login {
    public boolean login (Account account) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String password;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your password: ");
        password = scanner.nextLine();

        if (account.getName().equals((name)) && account.getPassword().equals((password))) {
            System.out.println("Welcome " + account.getName());
            System.out.println("Your balance is: " + account.getBalance());
            return true;
        } else {
            System.out.println("Wrong name or password");
            return false;
        }

    }};

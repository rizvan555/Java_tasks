package BankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        Account account1 =new Account();

        account1.setName("Rizvan Karimov");
        account1.setAccountNumber("123456789");
        account1.setBalance(1000);
        account1.setPhone("123456789");
        account1.setEmail("karimovrizvan84@gmail.com");
        account1.deposit(1000);
        account1.withdrawal(500);

        System.out.println("Name: " + account1.getName());
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Phone: " + account1.getPhone());
        System.out.println("Email: " + account1.getEmail());

        System.out.println("--------------------------------------------------");
    }
}

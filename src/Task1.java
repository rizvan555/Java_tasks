import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*+++++++++++++++++++++++++++++++++++++*");
        String actions = "1, Addition\n2, Subtraction\n3, Multiplication\n4, Division\n";
        System.out.println("Choose an action:\n" + actions);
        System.out.println("*+++++++++++++++++++++++++++++++++++++*");

        int action = scanner.nextInt();
        int firstNumber;
        int secondNumber;
        int result;

        switch (action){
            case 1:
                System.out.println("Enter first number:");
                firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                secondNumber = scanner.nextInt();
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;
            case 2:
                System.out.println("Enter first number:");
                firstNumber= scanner.nextInt();
                secondNumber = scanner.nextInt();
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);
                break;
            case 3:
                System.out.println("Enter first number:");
                firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                secondNumber = scanner.nextInt();
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);
                break;
            case 4:
                System.out.println("Enter first number:");
                firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                secondNumber = scanner.nextInt();
                System.out.println("Result: " + ((double)firstNumber / secondNumber));
                break;
            default:
                System.out.println("Invalid action");

        }



    }
}
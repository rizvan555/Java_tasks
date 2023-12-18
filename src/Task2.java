import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Wie viele grad Celsius sind es?");

        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        if (celsius < 0) {
            System.out.println("Es ist sehr Kalt!");
        } else if (celsius >= 0 && celsius < 10) {
            System.out.println("Es ist Kalt!");
        } else if (celsius >= 10 && celsius < 20) {
            System.out.println("Es ist kühl!");
        } else if (celsius >= 20 && celsius < 30) {
            System.out.println("Es ist warm!");
        } else if (celsius >= 30) {
            System.out.println("Es ist heiß!");
        } else {
            System.out.println("Ungültige Eingabe!");
        }


    }
}

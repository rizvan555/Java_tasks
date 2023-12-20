package MultiThreading1;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Printer 1");
        Printer printer2 = new Printer("Printer 2");

        printer1.start();
        printer2.start();


        System.out.println("Main thread started...");
    }
}

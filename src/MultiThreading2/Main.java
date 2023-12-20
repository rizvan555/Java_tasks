package MultiThreading2;

public class Main {
    public static void main(String[] args) {
        Scaner scaner1 = new Scaner("Scaner 1");
        Scaner scaner2 = new Scaner("Scaner 2");

        scaner1.start();
        scaner2.start();

        System.out.println("Main thread started...");

    }
}

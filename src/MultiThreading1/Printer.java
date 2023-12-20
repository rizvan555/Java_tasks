package MultiThreading1;

public class Printer extends Thread{
    @Override
    public void run(){
        System.out.println(name + " started");
        for (int i=1; i<10; i++){
            System.out.println(name + " write" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " finished");
    }
    private String name;
    public Printer(String name){
        this.name = name;
    }

}

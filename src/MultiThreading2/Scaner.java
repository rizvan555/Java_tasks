package MultiThreading2;

public class Scaner extends Thread {

    @Override
    public void run(){
        System.out.println(name + " started");
        for(int i=0; i<10; i++){
            System.out.println(name + " scanned" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " finished");
    }

    private String name;
    public Scaner(String name){
        this.name=name;
    }
}

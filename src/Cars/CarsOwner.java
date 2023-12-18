package Cars;

public class CarsOwner {
    private int owner;

    public void setOwner (int owner){

        if(owner<0){
            System.out.println("The number of owners cannot be negative");
            return;
        } else {
            this.owner=owner;
        }
    }
    public int getOwner(){
        return owner;
    }
}

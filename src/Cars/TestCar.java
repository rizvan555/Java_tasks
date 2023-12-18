package Cars;

public class TestCar {
    public static void main(String[] args) {

        // Create a new instance of the Car class
        Car car1 = new Car();
        car1.setColor ("blue");
        car1.setDoors (4); ;
        car1.setEngine("V6");
        System.out.println("Car1's color is " + car1.getColor());
        System.out.println("Car1's doors are " + car1.getDoors());
        System.out.println("Car1's engine is " + car1.getEngine());


        // Create a new instance of the Car class
        CarsOwner carOwner1 = new CarsOwner();
        carOwner1.setOwner(3);
        System.out.println("The Car has only " + carOwner1.getOwner() + " owner");




    }
}


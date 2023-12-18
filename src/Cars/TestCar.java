package Cars;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "blue";
        car1.doors = 4;
        car1.engine = "V6";
        System.out.println("Car1's color is " + car1.color);
        System.out.println("Car1's doors are " + car1.doors);
        System.out.println("Car1's engine is " + car1.engine);


        CarsOwner carOwner1 = new CarsOwner();
        carOwner1.owner = 1;
        System.out.println("The Car has only " + carOwner1.owner + " owner");
    }
}


public class Car extends Vehicle{
    private int numDoors;

    // overrides the vehicle accelerate() method to signify the car is accelerating
    @Override
    public void accelerate(){
        System.out.printf("Accelerating the car %s %s%n", getMake(), getModel());
    }
}

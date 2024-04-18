public class Truck extends Vehicle{
    private double cargoCapacity;

    // overrides the vehicle accelerate() method to specify the truck is accelerating
    @Override
    public void accelerate(){
        System.out.printf("Accelerating the truck %s %s%n", getMake(), getModel());
    }
}

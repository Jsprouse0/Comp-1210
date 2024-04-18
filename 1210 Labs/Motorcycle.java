public class Motorcycle extends Vehicle {
    private String engineType;

    // overrides the vehicle accelerate() method to specify the motorcycle is accelerating
    @Override
    public void accelerate(){
        System.out.printf("Accelerating the motorcycle %s %s%n", getMake(), getModel());
    }
}

import java.util.Scanner;

public class VehicleManagementSystem {


    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Car car = new Car();
        Truck truck = new Truck();
        Motorcycle motorcycle = new Motorcycle();
        Vehicle[] vehicles = {car, truck, motorcycle};  // vehicle object array to contain the type of vehicle class

        // enhanced for loop to set make/model and start, accelerate, and stop the type of vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.setMake(scnr.next());
            vehicle.setModel(scnr.next());

            vehicle.start();
            vehicle.accelerate();
            vehicle.stop();
        }

    }

}

public class Vehicle {
    private String make;
    private String model;
    public int year;


    // user sets the vehicle make
    public void setMake(String vehicle_make){
        make = vehicle_make;
    }

    // user sets the vehicle model
    public void setModel(String vehicle_model){
        model = vehicle_model;
    }

    // returns the vehicle make
    public String getMake(){
        return make;
    }

    // returns the vehicle model
    public String getModel(){
        return  model;
    }

    // starts the vehicle
    public void start() {
        System.out.printf("Starting the vehicle %s %s%n", make, model);
    }

    // stops the vehicle
    public void stop(){
        System.out.printf("Stopping the vehicle %s %s%n", make, model);
        System.out.println();
    }

    // accelerates the vehicle (will override by the car, truck, and motorcycle class
    public void accelerate(){
        System.out.printf("Accelerating the vehicle %s %s%n", make, model);
    }

}

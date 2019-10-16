package vehicles;

import vehicleComponents.Engine;

public class SportsCar extends Vehicle {

    private Engine engine;

    public SportsCar(String make, String model, double price, Engine engine) {
        super(make, model, price);
        this.engine = engine;
    }



}

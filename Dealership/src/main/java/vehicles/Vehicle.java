package vehicles;

public abstract class Vehicle {

    private String make;
    private String model;
    private double price;

    public Vehicle(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

}

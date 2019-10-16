package people;

import vehicles.SportsCar;
import vehicles.Vehicle;
import java.util.ArrayList;

public class Buyer extends Person {

    private ArrayList<Vehicle> ownedVehicles;

    public Buyer(String name, double wallet) {
        super(name, wallet);
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public int ownedVehiclesCount() {
        return this.ownedVehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        ownedVehicles.add(vehicle);
    }

    public void decreaseWallet(Vehicle vehicle) {
       double currentWallet = getWallet();
       currentWallet -= vehicle.getPrice();
       setWallet(currentWallet);
    }
}

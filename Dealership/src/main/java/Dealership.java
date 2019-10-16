import vehicles.Vehicle;
import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> vehicleStock;

    public Dealership(String name) {
        this.name = name;
        this.vehicleStock = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicleStock() {
        return vehicleStock;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleStock.add(vehicle);
    }
}

package people;

import vehicles.Vehicle;

public interface IBuy {

    void buy(IBuy buyer, ISell salesperson, Vehicle vehicle);

}

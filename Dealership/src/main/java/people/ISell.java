package people;

import vehicles.Vehicle;

public interface ISell {

    void sell(IBuy buyer, ISell salesperson, Vehicle vehicle);
}

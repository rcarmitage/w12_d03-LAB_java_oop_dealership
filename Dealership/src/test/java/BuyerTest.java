import org.junit.Before;
import org.junit.Test;
import people.Buyer;
import vehicleComponents.Engine;
import vehicles.SportsCar;

import static org.junit.Assert.assertEquals;

public class BuyerTest {

    Buyer buyer;
    Engine engine;
    SportsCar sportsCar;

    @Before
    public void before() {
        buyer = new Buyer("Rob", 100000.00);
        engine = new Engine("Make01", "Model01");
        sportsCar = new SportsCar("Porsche", "911", 90000.00, engine);
    }

    @Test
    public void hasName() {
        assertEquals("Rob", buyer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(100000.00, buyer.getWallet(), 0.01);
    }

    @Test
    public void canAddVehicle() {
        buyer.addVehicle(sportsCar);
        assertEquals(1, buyer.ownedVehiclesCount());
    }

    @Test
    public void canDecreaseWallet() {
        buyer.decreaseWallet(sportsCar);
        assertEquals(10000.00, buyer.getWallet(), 0.01);
    }

}

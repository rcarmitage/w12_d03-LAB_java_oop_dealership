import org.junit.Before;
import vehicleComponents.Engine;
import vehicles.SportsCar;

public class DealershipTest {

    Dealership dealership;
    SportsCar sportsCar;
    Engine engine;

    @Before
    public void before() {
        dealership = new Dealership("Arnold CodeClan");
        engine = new Engine("Make01", "Model01");
        sportsCar = new SportsCar("Porsche", "911", 90000.00, engine);
        dealership.addVehicle(sportsCar);
    }

}

import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicles.SportsCar;

import static org.junit.Assert.assertEquals;

public class SportsCarTest {

    SportsCar sportsCar;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine("Make01", "Model01");
        sportsCar = new SportsCar("Porsche", "911", 90000.00, engine);
    }

    @Test
    public void hasMake() {
        assertEquals("Porsche", sportsCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("911", sportsCar.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(90000.00, sportsCar.getPrice(), 0.01);
    }

}

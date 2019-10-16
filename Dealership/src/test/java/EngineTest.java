import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("Make01", "Model01");
    }

    @Test
    public void hasMake() {
        assertEquals("Make01", engine.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Model01", engine.getModel());
    }

}

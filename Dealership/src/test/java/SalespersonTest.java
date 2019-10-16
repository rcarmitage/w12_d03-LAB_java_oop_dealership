import org.junit.Before;
import org.junit.Test;
import people.Salesperson;

import static org.junit.Assert.assertEquals;

public class SalespersonTest {

    Salesperson salesperson;

    @Before
    public void before() {
        salesperson = new Salesperson("Lilliana", 1000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Lilliana", salesperson.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(1000.00, salesperson.getWallet(), 0.01);
    }

}

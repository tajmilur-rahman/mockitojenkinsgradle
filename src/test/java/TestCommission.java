import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCommission {
    private CalculateCommission calculate;

    @Before
    public void setup() {
        calculate = new CalculateCommission();
    }

    @Test
    public void testGetCommissionSkipWhileLoop() {
        assertEquals(0.0, calculate.getCommission(-1,Mockito.anyInt(),Mockito.anyInt()), 1.0);
    }

    @Test
    public void testGetCommissionEnterWhileLoop() {
        assertEquals(1200.0, calculate.getCommission(3,5,7), 10.0);
    }
}
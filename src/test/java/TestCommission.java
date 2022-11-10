import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Scanner;

@RunWith(MockitoJUnitRunner.class)
public class TestCommission {
    private CalculateCommission calculate;

    @Mock
    Scanner mockScanner;

    @InjectMocks
    private CalculateCommission calculateCommission = new CalculateCommission();

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @Ignore
    public void testGetCommissionSkipWhileLoop() {
        Assertions.assertEquals(0.0, calculateCommission.getCommission(-1, Mockito.anyInt(),Mockito.anyInt()), 1.0);
    }

    @Test
    public void testGetCommissionEnterWhileLoop() {
        when(mockScanner.nextInt()).thenReturn(Mockito.anyInt());
        Assertions.assertEquals(100, calculateCommission.getCommission(3,5,7), 10.0);
    }
}
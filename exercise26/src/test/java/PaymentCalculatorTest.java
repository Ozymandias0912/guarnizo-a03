import baseline.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentCalculatorTest {

    PaymentCalculator calcTest = new PaymentCalculator(12, 5000, 100);
    @Test
    void calculateMonthsUntilPaidOff(){
        assertEquals(70, Math.ceil(calcTest.calculateMonthsUntilPaidOff()));
    }
}

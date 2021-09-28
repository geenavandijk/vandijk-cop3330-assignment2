package ex26;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentCalculatorTest {

    @Test
    public void CalculatesValues() {
            PaymentCalculator calc = new PaymentCalculator();
            calc.setB(5000);
            calc.setApr(12);
            calc.setP(100);
            int n = calc.calculateMonthsUntilPaidOff();
            assertEquals(70, n);
    }
}
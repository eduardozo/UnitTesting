package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void testSum() {
        int result = calc.sumNumbers(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testSub() {
        int result = calc.subNumbers(10, 5);
        assertEquals(5 , result);
    }

    @Test
    public void testMult() {
        int result = calc.multNumbers(7, 3);
        assertEquals(21 , result);
    }

    @Test
    public void testDiv() {
        int result = calc.divNumbers(24, 2);
        assertEquals(12 , result);
    }
}
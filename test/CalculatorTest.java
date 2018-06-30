import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void sum() {
        Calculator calc = new Calculator();
        int result = calc.sumNumbers(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void sub() {
        Calculator calc = new Calculator();
        int result = calc.subNumbers(10, 5);
        assertEquals(5 , result);
    }
}
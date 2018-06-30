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

    @Test
    public void mult() {
        Calculator calc = new Calculator();
        int result = calc.multNumbers(7, 3);
        assertEquals(21 , result);
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        int result = calc.divNumbers(24, 2);
        assertEquals(12 , result);
    }
}
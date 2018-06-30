package calculator;

public class Calculator {
    public int sumNumbers(int a, int b) {
        return a + b;
    }

    public int subNumbers(int a, int b) {
        return a - b;
    }

    public int multNumbers(int a, int b) {
        return a * b;
    }

    public int divNumbers(int a, int b) {
        return (b != 0) ? a / b : 0;
    }
}

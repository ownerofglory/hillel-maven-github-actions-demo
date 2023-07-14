package ua.ithillel.maven.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add_test() {
        double a = 10;
        double b = 20;

        double expected = 30;

        double actual = calculator.add(a, b);

        assert expected == actual;
    }
}

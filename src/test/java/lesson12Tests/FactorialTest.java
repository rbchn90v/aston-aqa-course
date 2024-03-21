package lesson12Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.rbchn90v.lesson12.Factorial.calculateFactorial;

public class FactorialTest {
    @Test
    public void testCalculateFactorialPositiveCase() {
        Assertions.assertEquals(6, calculateFactorial(3));
    }

    @Test
    public void testCalculateFactorialBorderValue() {
        Assertions.assertEquals(calculateFactorial(1), 1);
    }

    @Test
    public void testCalculateFactorialNegativeCase() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculateFactorial(-4), "Invalid input data. The number should be > 0");
    }
}

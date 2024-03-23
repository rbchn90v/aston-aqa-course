import org.testng.Assert;
import org.testng.annotations.Test;

import static com.rbchn90v.lesson12.Factorial.calculateFactorial;

public class FactorialTest {
    @Test
    public void testCalculateFactorialPositiveCase() {
        Assert.assertEquals(calculateFactorial(5), 120);
    }

    @Test
    public void testCalculateFactorialBorderValue() {
        Assert.assertEquals(calculateFactorial(1), 1);
    }

    @Test
    public void testCalculateFactorialNegativeCase() {
        Assert.assertThrows("Invalid input data. The number should be > 0",
                IllegalArgumentException.class, () -> calculateFactorial(-5));
    }
}
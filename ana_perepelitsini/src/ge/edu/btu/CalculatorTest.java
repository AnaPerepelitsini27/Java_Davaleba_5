package ge.edu.btu;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
     void sum() {
        CalculatorServiceImpl calculator=new CalculatorServiceImpl();
        calculator.sum(20,4);
        assertEquals(24,calculator.sum(20,4));
    }

    @Test
    void prod() {
        CalculatorServiceImpl calculator=new CalculatorServiceImpl();
        calculator.prod(20,4);
        assertEquals(80,calculator.prod(20,4));
    }
}
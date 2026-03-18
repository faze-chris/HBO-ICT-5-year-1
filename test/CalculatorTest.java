import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        double a = 20.0;
        double b = 20.0;
        double expected = 40.0;

        assertEquals(40.0, calculator.add(a, b));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        double a = 30.0;
        double b = 20.0;
        double expected = 10.0;

        assertEquals(expected, calculator.subtract(a, b));
    }
    
    //fake test
//    @Test
//    void subtract2() {
//        Calculator calculator = new Calculator();
//        double a = 30.0;
//        double b = 20.0;
//        double expected = 20.0;
//
//        assertEquals(expected, calculator.subtract(a, b));
//    }
}
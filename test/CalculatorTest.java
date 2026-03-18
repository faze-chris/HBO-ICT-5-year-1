import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //proper way of testing.
    @Test
    void add() {
        // Arrange
        Calculator calculator = new Calculator();
        double result;
        //Act
        result = calculator.add(1, 2);
        //Assert
        assertEquals(3.0, result);

    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        double a = 30.0;
        double b = 20.0;
        double expected = 10.0;

        assertEquals(expected, calculator.subtract(a, b));
    }

    //fake test.
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
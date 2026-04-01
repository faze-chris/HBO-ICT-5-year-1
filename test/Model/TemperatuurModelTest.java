package Model;

import Observer.TemperatuurObserver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatuurModelTest {

    @Test
    void warmerTempTest() {
        // Arrange
        TemperatuurModel model = new TemperatuurModel();
        // Act
        model.warmer();
        // Assert
        assertEquals(21, model.getTemperatuur());
    }

    @Test
    void kouderTempTest() {
        // Arrange
        TemperatuurModel model = new TemperatuurModel();
        // Act
        model.kouder();
        // Assert
        assertEquals(19, model.getTemperatuur());
    }

    @Test
    void resetTempTest() {
        // Arrange
        TemperatuurModel model = new TemperatuurModel();
        model.warmer();
        model.warmer();
        // Act
        model.reset();
        // Assert
        assertEquals(20, model.getTemperatuur());
    }





}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DierenFrameTest {

    @Test
    void keyPressedHonger() {
        // Arrange
        Hond testHond = new Hond("hond", 50, 50);

        // Act
        testHond.voer();

        // Assert
        assertEquals(40, testHond.getHonger());

    }


    @Test
    void keyPressedEnergyie() {
        // Arrange
        Hond testHond = new Hond("hond", 50, 50);

        // Act
        testHond.voer();

        // Assert
        assertEquals(55, testHond.getEnergie());

    }
}

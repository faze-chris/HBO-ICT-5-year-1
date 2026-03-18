import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FestivalkKaartjeTest {

    @Test
    void testNietOudgenoegEnGeenOuders() {
        // Arrange
        int leeftijd = 14;
        boolean ouders = false;
        boolean result;
        //Act
        result = FestivalkKaartje.isOudGenoeg(leeftijd, ouders);
        //Assert
        assertFalse(result);

    }
    @Test
    void testNietOudgenoegEnWelOuders() {
        // Arrange
        int leeftijd = 14;
        boolean ouders = true;
        boolean result;
        //Act
        result = FestivalkKaartje.isOudGenoeg(leeftijd, ouders);
        //Assert
        assertTrue(result);
    }
    @Test
    void testWelOudgenoegEnGeenOuders() {
        // Arrange
        int leeftijd = 20;
        boolean ouders = false;
        boolean result;
        //Act
        result = FestivalkKaartje.isOudGenoeg(leeftijd, ouders);
        //Assert
        assertTrue(result);
    }
    @Test
    void testWelOudgenoegEnWelOuders() {
        // Arrange
        int leeftijd = 20;
        boolean ouders = true;
        boolean result;
        //Act
        result = FestivalkKaartje.isOudGenoeg(leeftijd, ouders);
        //Assert
        assertFalse(result);
    }


}
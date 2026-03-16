import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Personage implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased");
    }
}

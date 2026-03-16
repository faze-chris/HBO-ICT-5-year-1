import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        Personage personage = new Personage();
        frame.addKeyListener(personage);
        frame.setVisible(true);
    }


}


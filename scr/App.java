import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame scherm = new JFrame();
        scherm.setSize(200, 200); // TODO geef het venster een grootte
        // TODO: sluit programma bij sluiten
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel vak = new JPanel();
        // TODO: geef het panel een achtergrond
        vak.setBackground(Color.black);
        JLabel tekst = new JLabel();
        // TODO geef het label tekst: "Hello Swing"
        tekst.setText("Hello Swing");
        tekst.setFont(new Font(tekst.getFont().getFontName(), Font.BOLD, 14));
        tekst.setForeground(Color.white);
        JButton knop1 = new JButton();
        JButton knop2 = new JButton();
        // TODO: geef de knop tekst: "Klik
        knop1.setText("klik <-");
        knop1.addActionListener(e -> {
            tekst.setText("Clicked!");
            tekst.setLocation(tekst.getX() - 20, tekst.getY());
        });
        knop2.setText("klik ->");
        knop2.addActionListener(e -> {
            tekst.setText("Clicked!");
            tekst.setLocation(tekst.getX() + 20, tekst.getY());

        });
        vak.add(tekst);
        vak.add(knop1);
        vak.add(knop2);
        scherm.setContentPane(vak);
        scherm.setVisible(true); // TODO: maak het venster zichtbaar
    }
}

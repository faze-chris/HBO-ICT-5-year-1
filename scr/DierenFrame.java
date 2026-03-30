import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class DierenFrame extends JFrame implements KeyListener {
    // final = niet meer aan te passen nadat er een waarde aan is toegekend
    private final Dier dier;
    private final JPanel panel;

    private final JLabel naamLabel;
    private final JLabel energieLabel;
    private final JLabel hongerLabel;
    private final JLabel uitlegLabel;

    public DierenFrame(Dier dier) {
        this.dier = dier;

        setTitle("Dierenverzorger");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel(new GridLayout(4, 1));
        panel.setFocusable(true);
        panel.addKeyListener(this);

        naamLabel = new JLabel("", SwingConstants.CENTER);
        energieLabel = new JLabel("", SwingConstants.CENTER);
        hongerLabel = new JLabel("", SwingConstants.CENTER);
        uitlegLabel = new JLabel("Druk op F = voer, S = speel", SwingConstants.CENTER);

        panel.add(naamLabel);
        panel.add(energieLabel);
        panel.add(hongerLabel);
        panel.add(uitlegLabel);

        add(panel);

        refreshView();

        SwingUtilities.invokeLater(() -> panel.requestFocusInWindow());
    }

    public void refreshView() {
        naamLabel.setText("Naam: " + dier.getNaam());
        energieLabel.setText("Energie: " + dier.getEnergie());
        hongerLabel.setText("Honger: " + dier.getHonger());

        panel.revalidate();
        panel.repaint();
    }

    @Override  // Indicates that a method declaration is intended to override a method declaration in a supertype.
    public void keyPressed(KeyEvent e) {
        int toets = e.getKeyCode();
        // is dier een object dat interface Test.Verzorgbaar implementeert?
        // Ja? Dan wordt verzorgbaar aangemaakt als een gecast object van type Test.Verzorgbaar
        if (dier instanceof Verzorgbaar verzorgbaar) {
            if (toets == KeyEvent.VK_F) {
                verzorgbaar.voer();
                refreshView();
            } else if (toets == KeyEvent.VK_S) {
                verzorgbaar.speel();
                refreshView();
            }
        }
        panel.requestFocusInWindow();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Niet nodig voor deze opdracht
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Niet nodig voor deze opdracht
    }
}
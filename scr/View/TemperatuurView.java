package View;

import javax.swing.*;
import java.awt.*;

public class TemperatuurView extends JFrame implements TemperatuurObserver {
    private JLabel lblTemperatuurTitel;
    private JLabel lblTemperatuur;
    private JLabel lblStatusTitel;
    private JLabel lblStatus;

    private JButton btnWarmer;
    private JButton btnKouder;
    private JButton btnReset;

    private JPanel panel;

    public TemperatuurView() {
        setTitle("Temperatuurmeter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblTemperatuurTitel = new JLabel("Temperatuur:");
        lblTemperatuur = new JLabel("-");
        lblStatusTitel = new JLabel("Status:");
        lblStatus = new JLabel("-");

        btnWarmer = new JButton("Warmer");
        btnKouder = new JButton("Kouder");
        btnReset = new JButton("Reset");

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.add(lblTemperatuurTitel);
        panel.add(lblTemperatuur);
        panel.add(lblStatusTitel);
        panel.add(lblStatus);
        panel.add(btnWarmer);
        panel.add(btnKouder);
        panel.add(btnReset);

        add(panel);
    }

    public JButton getBtnWarmer() {
        return btnWarmer;
    }

    public JButton getBtnKouder() {
        return btnKouder;
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public void update(int temperatuur, String status) {
        lblTemperatuur.setText(temperatuur + " °C");
        lblStatus.setText(status);
    }
}

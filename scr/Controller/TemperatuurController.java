package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatuurController {
    private TemperatuurModel model;
    private TemperatuurView view;

    public TemperatuurController(TemperatuurModel model, TemperatuurView view) {
        this.model = model;
        this.view = view;

        this.view.getBtnWarmer().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.warmer();
            }
        });

        this.view.getBtnKouder().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.kouder();
            }
        });

        this.view.getBtnReset().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.reset();
            }
        });
    }
}

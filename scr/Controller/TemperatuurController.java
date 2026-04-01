package Controller;

import Model.TemperatuurModel;
import View.TemperatuurView;


public class TemperatuurController {
    private TemperatuurModel model;
    private TemperatuurView view;

    public TemperatuurController(TemperatuurModel model, TemperatuurView view) {
        this.model = model;
        this.view = view;

        koppelKnoppen();
    }

    private void koppelKnoppen() {
        view.getBtnWarmer().addActionListener(e -> model.warmer());
        view.getBtnKouder().addActionListener(e -> model.kouder());
        view.getBtnReset().addActionListener(e -> model.reset());
    }
}
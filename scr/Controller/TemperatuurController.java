package Controller;

import Model.TemperatuurModel;
import View.TemperatuurView;

public class TemperatuurController {

    public TemperatuurController(TemperatuurModel model, TemperatuurView view) {
        view.getBtnWarmer().addActionListener(e -> model.warmer());
        view.getBtnKouder().addActionListener(e -> model.kouder());
        view.getBtnReset().addActionListener(e -> model.reset());
    }
}
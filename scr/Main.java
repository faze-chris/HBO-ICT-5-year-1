// Hier komen de imports van jouw klassen.
import Controller.TemperatuurController;
import Model.TemperatuurModel;
import View.TemperatuurView;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                TemperatuurModel model = new TemperatuurModel();

                TemperatuurView view = new TemperatuurView();

                // Een voorbeeld voor de verdieping
                //StatusView statusView = new StatusView(); // deze view heeft geen controller want is passief en toont 1 stukje informatie

                TemperatuurController controller = new TemperatuurController(model, view);

                model.addObserver(view); // register
                //model.addObserver(statusView); // register

                // Start waarden
                view.update(model.getTemperatuur(), model.getStatus());
                //statusView.update(model.getTemperatuur(), model.getStatus());


                view.setVisible(true);

                //statusView.setVisible(true);
            }
        });
    }
}
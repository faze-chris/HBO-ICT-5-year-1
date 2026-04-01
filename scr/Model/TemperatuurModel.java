package Model;

import Observer.TemperatuurObserver;
import Observer.TemperatuurSubject;

import java.util.ArrayList;
import java.util.List;

public class TemperatuurModel implements TemperatuurSubject {
    private int temperatuur;
    private final int START_TEMPERATUUR = 20;
    private List<TemperatuurObserver> observers;

    public TemperatuurModel() {
        this.temperatuur = START_TEMPERATUUR;
        this.observers = new ArrayList<>();
    }

    public int getTemperatuur() {
        return temperatuur;
    }

    public String getStatus() {
        if (temperatuur >= 0 && temperatuur <= 9) return "Koud";
        if (temperatuur >= 10 && temperatuur <= 24) return "Aangenaam";
        return "Warm";
    }

    public void warmer() {
        if (temperatuur < 30) {
            temperatuur++;
            notifyObservers();
        }
    }

    public void kouder() {
        if (temperatuur > 0) {
            temperatuur--;
            notifyObservers();
        }
    }

    public void reset() {
        temperatuur = START_TEMPERATUUR;
        notifyObservers();
    }

    @Override
    public void addObserver(TemperatuurObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (TemperatuurObserver observer : observers) {
            observer.update(temperatuur, getStatus());
        }
    }
}
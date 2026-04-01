package Model;

import Observer.TemperatuurObserver;
import Observer.TemperatuurSubject;

import java.util.ArrayList;
import java.util.List;

public class TemperatuurModel implements TemperatuurSubject {
    private final int startTemp = 20;

    private int temperatuur = startTemp;
    private List<TemperatuurObserver> observers = new ArrayList<>();

    public int getTemperatuur() {
        return temperatuur;
    }

    public String getStatus() {
        if (temperatuur < 10) {
            return "Koud";
        }
        if (temperatuur < 25) {
            return "Aangenaam";
        } else {
            return "warm";
        }
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
        temperatuur = startTemp;
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
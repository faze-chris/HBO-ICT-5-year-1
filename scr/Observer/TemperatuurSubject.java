package Observer;

public interface TemperatuurSubject {
    void addObserver(TemperatuurObserver observer);

    void notifyObservers();
}
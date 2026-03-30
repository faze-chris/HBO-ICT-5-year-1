public class Hond extends Dier implements Verzorgbaar {

    public Hond(String naam, int energie, int honger) {
        super(naam, energie, honger);
    }

    @Override
    public void voer() {
        setHonger(getHonger() - 10);
        setEnergie(getEnergie() + 5);
    }

    @Override
    public void speel() {
        setEnergie(getEnergie() - 15);
        setHonger(getHonger() + 10);
    }
}
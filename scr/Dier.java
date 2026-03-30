public abstract class Dier {
    private String naam;
    private int energie;
    private int honger;

    public Dier(String naam, int energie, int honger) {
        setNaam(naam);
        setEnergie(energie); // methode aanroep is dus mogelijk!
        //TODO
    }

    public String getNaam() {
        return naam;
    }

    public int getEnergie() {
        return energie;
    }

    public int getHonger() {
        return honger;
    }

    protected void setNaam(String naam) {
        this.naam = naam;
    }

    protected void setEnergie(int energie) {
        this.energie = begrensWaarde(energie);
    }

    protected void setHonger(int honger) {
        this.honger = begrensWaarde(honger);
    }

    private int begrensWaarde(int waarde)
    {
        // TODO
        return waarde;
    }
}


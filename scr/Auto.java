public class Auto {
    private int wielen;
    private String kleur;

    public Auto(int wielen, String kleur) {
        this.wielen = wielen;
        this.kleur = kleur;
    }

    public void rijden() {
        System.out.println("ik rijdt!");
    }

    public int getWielen() {
        return this.wielen;
    }

    public void setwielen(int wielen) {
        this.wielen = wielen;
    }

    public void setkleur(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return this.kleur;
    }
//    private int wielen;
//    public int deur;
//    public String kleur;
//
//    public Auto(int input1, int input2, String input3) {
//        wielen = input1;
//        deur = input2;
//        kleur = input3;
//    }
//
//    void starten() {
//        System.out.println("Ik start");
//    }
//
//    private void rijden() {
//        System.out.println("Ik rij");
//    }
//    public void status() {
//       starten();
//       rijden();
//    }
//    public void status2() {
//        System.out.println(wielen);
//    }
}

public class Auto {

    int wielen;
    int deur;
    String kleur;

    public Auto(int input1, int input2, String input3) {
        wielen = input1;
        deur = input2;
        kleur = input3;
    }
    public Auto( int input2, String input3) {
        deur = input2;
        kleur = input3;
    }

    void starten() {
        System.out.println("Ik start");
    }

    void rijden() {
        System.out.println("Ik rij");
    }
}

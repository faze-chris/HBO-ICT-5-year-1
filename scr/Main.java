import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, world!");


        Kat kat = new Kat();
        Hond hond = new Hond();

        ArrayList<Dier> dieren = new ArrayList<Dier>();
        dieren.add(kat);
        dieren.add(hond);
        for (Dier dier : dieren) {
            dier.geluid();

        }

    }
}


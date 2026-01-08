import java.util.Scanner;

public class Main {

    public static int[][] bord = new int[7][6];

    public static int getVakje(int x, int y) {
        return bord[x - 1][y - 1];
    }

    public static void setVakje(int x, int y, int inhoud) {
        bord[x - 1][y - 1] = inhoud;
    }

    public static void leesBord(Scanner scanner) {

        for (int i = 5; i >= 0; i--) {

            for (int j = 0; j < 7; j++) {
                bord[j][i] = scanner.nextInt();
            }
        }
    }

    public static void ruimOp() {

        for (int kolom = 1; kolom <= 7; kolom++) {

            for (int rij = 1; rij <= 6; rij++) {
                setVakje(kolom, rij, 0);
            }
        }
    }

    public static void verwerkZet(int speler, int kolom) {

        int rij = 1;

        while (getVakje(kolom, rij) > 0) {
            rij++;
        }

        setVakje(kolom, rij, speler);
    }

    public static void vraagZet(Scanner scanner, int speler) {

        int kolom = 0;

        while ((kolom < 1) || (kolom > 7)) {

            kolom = scanner.nextInt();

            if ((kolom >= 1) && (kolom <= 7) && (getVakje(kolom, 6) > 0)) {
                System.out.println("Kolom vol, kies opnieuw!");
                kolom = 0;
            } else {
                verwerkZet(speler, kolom);
            }
        }
    }

    public static boolean gewonnenKolom(int speler, int kolom) {

        int teller = 0;

        for (int i = 1; i <= 6; i++) {

            if (getVakje(kolom, i) == speler) {
                teller++;
            } else {
                teller = 0;
            }

            if (teller == 4) {
                return true;
            }
        }

        return false;
    }

    public static boolean gewonnenRij(int speler, int rij) {

        int teller = 0;

        for (int i = 1; i <= 7; i++) {

            if (getVakje(i, rij) == speler) {
                teller++;
            } else {
                teller = 0;
            }

            if (teller == 4) {
                return true;
            }
        }

        return false;
    }

    public static int nextX(String richting, int x) {
        return x + 1;
    }

    public static int nextY(String richting, int y) {

        if (richting.equals("NO")) {
            return y + 1;
        } else {
            return y - 1;
        }
    }

    public static boolean gewonnenDiagonaalOpRichting(String richting, int x, int y, int speler) {

        if ((richting.equals("NO") && (y >= 4))
                ||
                (richting.equals("ZO") && (y <= 3))) {
            return false;
        } else {

            for (int i = 0; i < 4; i++) {

                if (getVakje(x, y) != speler) {
                    return false;
                } else {
                    x = nextX(richting, x);
                    y = nextY(richting, y);
                }
            }

            return true;
        }
    }

    public static boolean gewonnenDiagonaal(int speler) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 6; j++) {

                if (gewonnenDiagonaalOpRichting("NO", i, j, speler)
                        ||
                        gewonnenDiagonaalOpRichting("ZO", i, j, speler)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean gewonnen(int speler) {

        for (int i = 1; i <= 7; i++) {

            if (gewonnenKolom(speler, i)) {
                return true;
            }
        }

        for (int i = 1; i <= 6; i++) {

            if (gewonnenRij(speler, i)) {
                return true;
            }
        }

        return gewonnenDiagonaal(speler);
    }

    public static boolean checkVol() {

        for (int kolom = 1; kolom <= 7; kolom++) {

            if (getVakje(kolom, 6) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void drukAf() {

        for (int j = 6; j >= 1; j--) {

            for (int i = 1; i <= 7; i++) {

                System.out.print(getVakje(i, j));

                if (i <= 6) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static int wisselSpeler(int speler) {

        if (speler == 1) {
            return 2;
        }

        return 1;
    }

    public static void vierOpEenRij(Scanner scanner) {

        boolean eindeSpel = false;
        int speler = 1;
        ruimOp();

        while (!eindeSpel) {

            if (checkVol()) {
                System.out.println("Gelijk!");
                eindeSpel = true;
            } else {

                vraagZet(scanner, speler);
                drukAf();
                System.out.println();

                if (gewonnen(speler)) {
                    System.out.printf("Speler %d heeft gewonnen!%n", speler);
                    eindeSpel = true;
                } else {
                    speler = wisselSpeler(speler);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vierOpEenRij(scanner);
    }
}
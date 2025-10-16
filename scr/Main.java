import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal = scanner.nextInt();
        scanner.nextLine();
        String letter = scanner.nextLine();

        if (letter.equals("N")) {
            System.out.println("Heb je een rijbewijs?");
            System.out.println("Mee naar het bureau!");
        }
        else if (letter.equals("J") && getal > 2) {
            System.out.println("Heb je een rijbewijs?");
            System.out.println("Hoeveel biertjes heb je gedronken?");
            System.out.println("Rijbewijs inleveren!");
        }
        else if (letter.equals("J")) {
            System.out.println("Heb je een rijbewijs?");
            System.out.println("Hoeveel biertjes heb je gedronken?");
            System.out.println("Een goede avond verder!");
        }

    }
}

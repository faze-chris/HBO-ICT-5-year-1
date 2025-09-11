import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, world!");
        Scanner scanner = new Scanner(System.in);
        int getal1 = scanner.nextInt();
        int getal2 = scanner.nextInt();
        scanner.nextLine();
        String operator = scanner.nextLine();

        System.out.println(getal2);
        System.out.println(operator);
        System.out.println(getal2);
        System.out.println("=");
        System.out.println(getal1 + getal2);
    }
}


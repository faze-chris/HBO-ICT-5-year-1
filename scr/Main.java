import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Sinaasappel");
        fruit.add("Banaan");
        fruit.add("Appel");
        fruit.add("Kiwi");
        fruit.add("Druif");
        fruit.add("Mango");
        fruit.add("Kers");
        fruit.add("Peer");
        fruit.add("Framboos");
        fruit.add("Aardbei");
        fruit.add("Citroen");

        System.out.println("random fruit");
        System.out.println(fruit);
        bubbleSort(fruit);

        System.out.println("Na het sorteren (alfabetisch):");
        System.out.println(fruit);
    }

    public static void bubbleSort(ArrayList<String> lijst) {
        int n = lijst.size();
        boolean gewisseld;


        for (int i = 0; i < n - 1; i++) {
            gewisseld = false;

            for (int j = 0; j < n - i - 1; j++) {


                if (lijst.get(j).compareTo(lijst.get(j + 1)) > 0) {

                    String temp = lijst.get(j);
                    lijst.set(j, lijst.get(j + 1));
                    lijst.set(j + 1, temp);

                    gewisseld = true;
                }
            }

            if (!gewisseld) {
                break;
            }
        }
    }
}



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

        System.out.println("random fruit order");
        System.out.println(fruit);

        bubbleSort(fruit);

        System.out.println("Na het sorteren (alfabetisch):");
        System.out.println(fruit);
    }

    public static void bubbleSort(ArrayList<String> list) {
        int listSize = list.size();
        boolean gewisseld;

        for (int i = 0; i < listSize - 1; i++) {
            gewisseld = false;
            for (int currentIndex = 0; currentIndex < listSize - i - 1; currentIndex++) {

                if (list.get(currentIndex).compareTo(list.get(currentIndex + 1)) > 0) {
                    String temp = list.get(currentIndex);
                    list.set(currentIndex, list.get(currentIndex + 1));
                    list.set(currentIndex + 1, temp);

                    gewisseld = true;
                }
            }
            if (!gewisseld) {
                break;
            }
        }
    }
}
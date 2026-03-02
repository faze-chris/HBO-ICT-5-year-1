import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Product gucciTas = Product.Tas;
        System.out.println(gucciTas.prijs);


        HashMap<String, Integer> producten = new HashMap<>();
        producten.put("tas",  5);
        producten.put("Jas", 15);
        producten.put("Schoenen", 20);
        System.out.println(producten.get("Jas"));

        

    }
}


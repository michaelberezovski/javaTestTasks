package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapProducts {


    public static void main(String[] args) {
        HashMap<Integer, Product> hashMap = new HashMap<>();

        hashMap.put(1, new Bananas("Banana", "OOO", 10));
        hashMap.put(2, new Apples("Apple", "OOO", 3));
        hashMap.put(3, new Beer("Beer1", "OOO", 7));
        hashMap.put(4, new Beer("Beer2", "OOO", 8));
        hashMap.put(5, new Beer("Beer3", "OOO", 4));

        checkMoreThan5(hashMap);

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        refill(hashMap, list);

        System.out.println("\n");

        checkMoreThan5(hashMap);
    }

    private static void refill(HashMap<Integer, Product> hashMap, List<Integer> list) {
        for (Map.Entry<Integer, Product> entry : hashMap.entrySet()) {
            for (Integer i : list) {
                if (entry.getKey().equals(i)) {
                    int number = entry.getValue().getNumberOfProducts();
                    entry.getValue().setNumberOfProducts(number + 10);
                }
            }
        }
    }

    private static void checkMoreThan5(HashMap<Integer, Product> hashMap) {
        for (Map.Entry<Integer, Product> entry : hashMap.entrySet()) {
            if (entry.getValue().getNumberOfProducts() > 5) {
                System.out.println("Product ID: " + entry.getKey());
            }
        }
    }
}

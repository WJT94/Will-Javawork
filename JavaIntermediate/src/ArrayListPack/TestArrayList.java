package ArrayListPack;

import java.util.HashMap;
import java.util.Map;

public class TestArrayList {
    public static void main(String[] args) {
        Map<Integer, Product> prodMap = new HashMap<>();
        

        Product prod1 = new Product("Bluetooth", 50, 10, "Boat");
        Product prod2 = new Product("TV", 1000, 5, "Apple");
        Product prod3 = new Product("Phone", 400, 8, "Samsung");
        Product prod4 = new Product("Tripod", 70, 15, "Digitech");

        prodMap.put(1, prod1);
        prodMap.put(2, prod2);
        prodMap.put(3, prod3);
        prodMap.put(4, prod4);

        for (Map.Entry<Integer, Product> m : prodMap.entrySet()) {
            System.out.println(m.getKey() + " --- " + m.getValue().name);
        }
    }
}

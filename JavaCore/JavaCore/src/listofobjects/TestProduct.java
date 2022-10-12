package listofobjects;

import java.util.ArrayList;

public class TestProduct {
    public static void main(String[] args) {
        Product prod1 = new Product("Bluetooth", 50, 10, "Boat");
        Product prod2 = new Product("TV", 1000, 5, "Apple");
        Product prod3 = new Product("Phone", 400, 8, "Samsung");
        Product prod4 = new Product("Tripod", 70, 15, "Digitech");


        ArrayList<Product> list = new ArrayList<Product>();
        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        list.add(prod4);

        for (Product p : list) {
            if (p.getPrice() > 100 && p.getQuantity() > 5) {
                System.out.println(p);
            }
        }

        
    }
}

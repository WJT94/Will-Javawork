package ArrayListPack;

public class Product {
    String name;
    int price;
    int quantity;
    String brand;
    
    public Product(String name, int price, int quantity, String brand) {
        super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    public Product() {
        super();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", brand=" + brand + "]";
    }
}

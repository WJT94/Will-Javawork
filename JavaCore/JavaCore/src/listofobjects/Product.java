package listofobjects;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String brand;
    
    public Product(String name, int price, int quantity, String brand) {
        super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format(
            "Product \n[\n name = %s\n price = %s\n quantity = %s\n brand = %s\n]",
            this.name, this.price, this.quantity, this.brand
        );
    }
}

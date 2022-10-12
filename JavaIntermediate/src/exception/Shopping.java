package exception;

public class Shopping {
    // Takes responsibility for handling exceptions
    public void addToCart() {
        String[] cart = new String[5];
        try {
            cart[5] = "Mobile";
        } catch (Exception e) {

        }
    }

    // Declaring exceptions
    public void makePayment() throws Exception {
        int x = 10;
        int y = 0;
        int z = x / y;
    }
    
}

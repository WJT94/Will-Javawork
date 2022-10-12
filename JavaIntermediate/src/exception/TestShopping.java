package exception;

public class TestShopping {
    public static void main(String[] args) {
        Shopping sh = new Shopping();
        sh.addToCart();
        try {
            sh.makePayment();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test shopping issue!");
        }
    }
}

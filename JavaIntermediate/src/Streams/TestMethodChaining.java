package Streams;

public class TestMethodChaining {
    public static void main(String[] args) {
        /*
        MethodChaining obj = new MethodChaining();

        obj.getObject();
        obj.addToX(10);
        obj.show();
        */

        new MethodChaining().getObject().addToX(10).show();
    }
}

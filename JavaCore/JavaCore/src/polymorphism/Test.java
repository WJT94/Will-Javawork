package polymorphism;

public class Test {
    public static void main(String[] args) {
        Liquid l = new Liquid();
        Milk m = new Milk();
        Tea t = new Tea();
        Mug mg = new Mug();
        mg.addLiquid(l);
        mg.addLiquid(m);
        mg.addLiquid(t);
    }
}

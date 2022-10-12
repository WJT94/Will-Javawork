package exception;

public class Upasana {
    public static void main(String[] args) {
        Upasana up = new Upasana();
        up.method5();
    }

    public void method1() {
        int z = 10 / 0;
    }
    public void method2() {
        method1();
    }
    public void method3() {
        method2();
    }
    public void method4() {
        method3();
    }
    public void method5() {
        method4();
    }
}

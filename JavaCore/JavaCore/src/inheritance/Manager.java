package inheritance;

public class Manager extends Employee {
    public Manager(String inputName) {
        super(inputName);
    }

    public void talk() {
        System.out.println(String.format("Hi, my name is %s and I manage!", this.name));
    }
}

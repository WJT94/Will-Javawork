package inheritance;

public class Employee extends Person {

    public Employee(String inputName) {
        super(inputName);
        this.age = 18;
    }
    
    public void talk() {
        System.out.println(String.format("Hi, my name is %s and I work!", this.name));
    }
}

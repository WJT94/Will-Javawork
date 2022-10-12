package inheritance;

public class Person {
    public String name;
    public int age = 0; // we've now established Person instances should have an "age" variable

    public Person(String inputName) { // This one will be called if we only supply one argument, as a string
        this.name = inputName;
    }

    public Person(String inputName, int inputAge) { // This one will be called if we supply two arguments, a string and an integer!
        this.name = inputName;
        this.age = inputAge;
        this.introduce();
    }

    public void introduce() {
        System.out.println(String.format("Say hi to %s! They are %s years old.", this.name, this.age));
    }
}

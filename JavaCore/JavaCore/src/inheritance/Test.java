package inheritance;

public class Test {
    public static void main(String[] args) {

        Manager man = new Manager("Overlord");
        Employee emp = (Employee) man;
        Employee emp2 = new Employee("Second Peon");
        Employee man2 = new Manager("Second Overlord");
        
        emp.talk();
        man.talk();
        emp2.talk();
        man2.talk();

        final int finalInt = 0;
        System.out.println(finalInt);
    }

    public static void agePerson(Person person) {
        person.age += 1;
        System.out.println(String.format("Happy Birthday! %s is now %s years old.", person.name, person.age));
    }
}

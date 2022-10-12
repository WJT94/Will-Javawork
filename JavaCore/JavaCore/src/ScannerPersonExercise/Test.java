package ScannerPersonExercise;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Person bobby = new Person("Bobby", 10, "Student");
        Person samantha = new Person("Samantha", 25, "Librarian");
        Person michael = new Person("Michael", 42, "Accountant");
    
        ArrayList<Person> personList = new ArrayList<Person>();
    
        personList.add(bobby);
        personList.add(samantha);
        personList.add(michael);

        for (Person p : personList) {
            System.out.println(p);
        }
    }
}

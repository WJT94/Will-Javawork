package listofobjects;

import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> pList = new ArrayList<Person>();
        pList.add(new Person("Upasana", 32, "Trainer"));

        System.out.println(pList);
    }
}

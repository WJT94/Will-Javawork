package listofobjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    String jobTitle;

    public Person(String name, int age, String jobTitle) {
        super();
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public void getPerson(ArrayList<Person> x) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter job title to be searched:");
        String jTitle = scn.next();
        for (Person p : x) {
            if (p.jobTitle.equals(jTitle)) {
                System.out.println(p);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Person [\n name=" + name + ",\n age=" + age + ",\n jobTitle=" + jobTitle + "\n]";
    }

    
}

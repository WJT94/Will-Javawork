package MethodRef;

public class Test {
    public static void main(String[] args) {
        School sch = new School();
        Noteable nt1 = sch::noteLecture;
        nt1.note("Lecture");

        Noteable nt2 = sch::noteObservation;
        nt2.note("Observation notes asdf asdf asdf ");

        Noteable nt3 = sch::noteOnlineClass;
        nt3.note("Online stuff! jghlfkdjfhgljk");

        School mySchool = new School();
        mySchool.noteLecture("asdf");
    }
}

package ArrayListPack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetsExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("D");
        hashSet.add("F");
        hashSet.add("F"); // this will overwite the previous "F", as duplicate values are not permitted
        System.out.println(hashSet);

        System.out.println(hashSet.isEmpty());

        if (hashSet.size() == 0) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println(hashSet.size());
        }

        hashSet.remove("A");

        Iterator<String> setIterator = hashSet.iterator();
        while (setIterator.hasNext()) {
            String obj = (String) setIterator.next();
            System.out.println(obj);
        }

        hashSet.clear();

        System.out.println(hashSet.contains("B")); // returns false, as .clear() deleted everything
    }
}
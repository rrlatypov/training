package lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       TreeSet<String> strings = new TreeSet<>(new ReverseString());
        strings.add("8");
        strings.add("10");
        strings.add("rrr");
        strings.add("eee");
        strings.add("www");
        strings.add("iii");

        for (Iterator<String> iter=strings.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }

    }
}

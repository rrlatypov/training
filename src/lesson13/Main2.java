package lesson13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.SortedSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(134);
        integers.add(32);
        integers.add(544);
        integers.add(10);

        HashSet<String> strings = new HashSet<>();
        strings.add("qqq");
        strings.add("eee");
        strings.add("www");
        strings.add("aaa");

        SetUtilsImpl utils = new SetUtilsImpl();
        SortedSet <String> result = utils.orderedSet(integers, strings);
        System.out.println(result);

    }
}

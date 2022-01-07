package homeWork13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Meine1 {
    public static void main(String[] args) {
        HashSet<Integer> collec1 = new HashSet<>();

        collec1.add(1);
        collec1.add(2);
        collec1.add(3);
        collec1.add(4);

        ArrayList<Integer> collec2 = new ArrayList<>();

        collec2.add(3);
        collec2.add(4);
        collec2.add(5);
        collec2.add(6);

        CUIhome utils = new CUIhome();
        Collection<Integer> result = utils.intersection(collec1, collec2);
        Collection<Integer> result1 = utils.unionWithoutDuplicate(collec1, collec2);
        Collection<Integer> result2 = utils.intersectionWithoutDuplicate(collec1, collec2);
        Collection<Integer> result3 = utils.difference(collec1, collec2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}

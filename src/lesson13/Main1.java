package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        HashSet<Integer> coll1 = new HashSet<>();

        coll1.add(1);
        coll1.add(2);
        coll1.add(3);
        coll1.add(4);

        ArrayList<Integer> coll2 = new ArrayList<>();

        coll2.add(3);
        coll2.add(4);
        coll2.add(5);
        coll2.add(6);

        CollecntionUtilImpl utils = new CollecntionUtilImpl();
        Collection<Integer> result1 = utils.union(coll1, coll2);
        Collection<Integer> result2 = utils.intersection(coll2, coll1);
        Collection<Integer> result3 = utils.unionWithoutDuplicate(coll1, coll2);
        Collection<Integer> result4 = utils.intersectionWithoutDuplicate(coll1, coll2);
        Collection<Integer> result5 = utils.difference(coll1, coll2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}

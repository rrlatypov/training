package lesson13;

import java.util.*;

public class CollecntionUtilImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(a);
        integers.addAll(b);
        return integers;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.addAll(a);
        integers1.retainAll(b);
        return integers1;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        TreeSet<Integer> integers2 = new TreeSet<>();
        integers2.addAll(a);
        integers2.addAll(b);
        return integers2 ;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
//        ArrayList<Integer> integers3 = new ArrayList<>();
//        integers3.addAll(a);
//        integers3.retainAll(b);
        return null;

    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> integers4 = new HashSet<>();
        TreeSet<Integer> integers2 = new TreeSet<>();
        integers2.addAll(a);
        integers2.addAll(b);
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.addAll(a);
        integers1.retainAll(b);


        return null;

    }
}

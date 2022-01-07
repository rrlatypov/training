package homeWork13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class CUIhome implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.addAll(a);
        integers1.retainAll(b);
        integers1.addAll(b);
        integers1.retainAll(a);

        return integers1;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet <Integer> integers2 = new LinkedHashSet<>();

        integers2.addAll(a);
        integers2.addAll(b);

        return integers2;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> integers3 = new LinkedHashSet<>();

        for (Integer num:b){
            if (a.contains(num)){
                integers3.add(num);
            }
        }
        return integers3;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList <Integer> integers4 = new ArrayList<>();

        for (Integer num : a){
            if (!b.contains(num)){
                integers4.add(num);

            }
        }
        for (Integer num : b){
            if (!a.contains(num)){
                integers4.add(num);
            }
        }
        return integers4;
    }
}

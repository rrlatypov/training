package lesson13;

import java.util.*;

public class ListUtilsImpl implements ListUtils {


    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        LinkedList <String> result = new LinkedList <>();
        for (String s:strings){
            result.add(s);
        }
        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        ArrayList<Double> result = new ArrayList<>();
        result.addAll(data);
        Collections.sort(result, new Comparator<Double>() {
            @Override
            public int compare(Double aDouble, Double t1) {
                return t1.compareTo(aDouble);

            }
        });
        return result;

    }
}

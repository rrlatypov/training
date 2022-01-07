package lesson13;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        ListUtilsImpl utils = new ListUtilsImpl();

        List<String> result = utils.asList( "qqq", "www", "ddd", "fff", "sss");
        System.out.println(result);
        ArrayList <Double> doubles = new ArrayList<>();
        doubles.add(2.4);
        doubles.add(2.6);
        doubles.add(3.4);
        doubles.add(6.4);

        List<Double> result2 = utils.sortedList(doubles);
        System.out.println(result2);


    }
}

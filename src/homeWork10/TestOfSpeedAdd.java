package homeWork10;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestOfSpeedAdd {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add("timetime" + i);
        }
        long finish = System.currentTimeMillis();
        System.out.println((finish - start) + " - миллисекунд выполнялся тест ArrayList");

        LinkedList<String> linkedList = new LinkedList<>();
        long startNew = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("timetime" + i);
        }
        long finishNew = System.currentTimeMillis();
        System.out.println((finishNew - startNew) + " - миллисекунд выполнялся тест LinkedList");


    }
}

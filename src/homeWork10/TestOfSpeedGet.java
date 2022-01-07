package homeWork10;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestOfSpeedGet {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add (" ");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println((finish - start) + " - миллисекунд выполнялся тест ArrayList");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(" ");
        long startNew = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        long finishNew = System.currentTimeMillis();
        System.out.println((finishNew - startNew) + " - миллисекунд выполнялся тест LinkedList");
    }
}

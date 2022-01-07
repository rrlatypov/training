package lesson10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qqq");
        list.add("ddd");
        list.add("fff");
        list.set(0, "!!!");
        list.remove("!!!");

        System.out.println(list);
    }
}

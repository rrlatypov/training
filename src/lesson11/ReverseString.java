package lesson11;

import java.util.Comparator;

public class ReverseString implements Comparator<String> {


    @Override
    public int compare(String s, String t1) {
        return t1.compareTo(s);
    }
}

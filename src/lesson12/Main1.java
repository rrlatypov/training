package lesson12;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    final static int RED = 1;
    final static int GREEN = 2;
    final static int BLUE = 3;
    final static int BLACK = 4;

    public static void main(String[] args) {
        int color = 4;
        String text = "";
        switch (color){
            case RED:
                text = "красный";
                break;
            case GREEN:
                text = "зеленый";
                break;
            case BLUE:
                text = "синий";
                break;
            default:
                text = "не определен";

        }
        System.out.println(text);

        Map <Integer, String> codeToText = new HashMap<>();
        codeToText.put(RED, "красный");
        codeToText.put(GREEN, "зеленый");
        codeToText.put(BLUE, "синий");
        codeToText.put(BLACK, "черный");
//        text = codeToText.get(color);
//
//        if (text == null)
//            text = "не определен";
        text = codeToText.getOrDefault(color, "не определен");

        System.out.println(text);


    }
}

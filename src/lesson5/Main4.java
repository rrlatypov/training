package lesson5;

public class Main4 {
    public static void main(String[] args) {
        String text = " new big text";
//        заменить все гласные буквы на восклицательные знаки
        String newText = text.replace("e", "!");
        String newText2 = newText.replace("i", "!");
        String newText3 = newText2.replace("a", "!");
        String newText4 = newText3.replace("y", "!");
        String newText5 = newText4.replace("o", "!");
        String newText6 = newText5.replace("u", "!");
        System.out.println(newText6);
//        или
        text = text.replace("e", "!");
        text = text.replace("i", "!");
        text = text.replace("a", "!");
        text = text.replace("y", "!");
        text = text.replace("o", "!");
        text = text.replace("u", "!");
        System.out.println(text);

    }
}

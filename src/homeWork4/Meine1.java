package homeWork4;

public class Meine1 {
    public static void main(String[] args) {
        String text = "I am learning java";
        String[] slova = text.split(" ");
        for (int i = 0; i < slova.length; i++) {
            System.out.println(new StringBuilder(slova[i]).reverse().toString());
        }
    }
}

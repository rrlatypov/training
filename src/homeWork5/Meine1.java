package homeWork5;

public class Meine1 {
    public static void main(String[] args) {
        String text = "ja idu, shagaju po moskve";
        char[] bukvy = text.toCharArray();
        int glassnyaBukva = 0;
        for (int i = 0; i < bukvy.length; i++) {
            if (bukvy[i] == 'a' || bukvy[i] == 'o' || bukvy[i] == 'u' || bukvy[i] == 'e' || bukvy[i] == 'i' || bukvy[i] == 'y') {
                glassnyaBukva++;

            }
        }
        System.out.println("гласных в тексте: " + glassnyaBukva);
    }
}

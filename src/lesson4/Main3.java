package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String text = "I am learning java";
        String [] words = text.split(" ");
        for (int i = words.length -1; i>=0; i--){
            System.out.println(words[i]);
        }


    }
}

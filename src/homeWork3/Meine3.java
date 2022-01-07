package homeWork3;

public class Meine3 {
    public static void main(String[] args) {
        String bukvy = "mama myla ramu";
        char[] bukvyTexta = bukvy.toCharArray();
        for (int i = 0; i < bukvyTexta.length; i++) {
            if (bukvyTexta[i] == 'a' || bukvyTexta[i] == 'y' || bukvyTexta[i] == 'u') {
                char glasnye = bukvyTexta[i];
                System.out.println(glasnye);
            }
        }

    }
}

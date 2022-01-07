package homeWork5;

public class Meine3 {
    public static void main(String[] args) {
        String text = "i like move it";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int [] podschet = new int[alphabet.length];
        for (int i = 0; i< alphabet.length; i++){
            int podschetSimvolov = 0;
            for (int j = 0; j<text.length(); j++){
                if (alphabet [i] == text.charAt(j)){
                    podschetSimvolov++;

                }
            }
            podschet[i] = podschetSimvolov;
        }
        for (int i=0; i< alphabet.length; i++){
            System.out.println("букв " + alphabet[i] + "-" + podschet[i]);
        }
    }
}

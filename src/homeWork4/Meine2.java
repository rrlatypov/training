package homeWork4;

public class Meine2 {
    public static void main(String[] args) {
        char[] alfavit = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String text = "i am learning java";
        char[] shifr = text.toCharArray();
        for (int i = 0; i < shifr.length; i++) {
            for (int j = 0; j < alfavit.length; j++) {
                if (shifr[i] == ' ') {
                    break;
                }
                if (shifr[i] == alfavit[alfavit.length - 1]) {
                    shifr[i] = alfavit[0];

                    break;
                }
                if (shifr[i] == alfavit[j]) {
                    shifr[i] = alfavit[j + 1];

                    break;
                }
            }
        }
        System.out.println(shifr);
    }
}


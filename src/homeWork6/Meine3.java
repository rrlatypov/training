package homeWork6;

public class Meine3 {
    public static void main(String[] args) {
        int b = 15;
        int a = 5;

        if (a == b) {
            System.out.println(a);
            return;
        }
        if (a > b) {

            for (int i = 1; i <= a; i++) {
                int denominator = (i * b) % a;
                if (denominator == 0) {
                    System.out.println(i * b);
                    break;
                }
            }
        }
        if (a < b) {
            for (int i = 1; i <= b; i++) {
                int denominator = ((i * a) % b);
                if (denominator == 0) {
                    System.out.println(i * a);
                    break;
                }
            }
        }
    }
}

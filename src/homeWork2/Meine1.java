package homeWork2;

public class Meine1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 3;
        if ((a < b) && (a < c)) {
            System.out.println(a);
        }
        if ((b < a) && (b < c)) {
            System.out.println(b);
        }
        if ((c < a) && (c < b)) {
            System.out.println(c);
        }
    }
}

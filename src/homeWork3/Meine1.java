package homeWork3;

public class Meine1 {
    public static void main(String[] args) {
        int summa = 0;
        int[] massiv = {10, 15, 20, 25, 30};
        for (int i = 0; i < massiv.length; i++) {
            summa = summa + massiv[i];
        }
        System.out.println(summa);
    }
}

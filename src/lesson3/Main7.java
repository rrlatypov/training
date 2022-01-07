package lesson3;

public class Main7 {
    public static void main(String[] args) {
        int summ = 0;
        int[] massive1 = {1, 8, 7, 9, 8, 8};
        for (int i = 0; i<massive1.length; i++){
            if (massive1[i] % 2 == 0) {
                summ = summ + massive1[i];

            }
        }
        System.out.println(summ);

    }
}

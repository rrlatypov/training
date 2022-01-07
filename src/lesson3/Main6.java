package lesson3;

public class Main6 {
    public static void main(String[] args) {
        int[] massive = new int[5];
        int index = 0;
        for (int i = 1; i < 80; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                massive[index] = i;
                System.out.println(massive[index]);
                index++;

            }
        }

    }
}

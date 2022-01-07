package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        int value = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value += 2;
            System.out.println(numbers[i]);
        }


    }
}

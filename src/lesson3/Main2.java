package lesson3;

public class Main2 {
    public static void main(String[] args) {
//        объявление массива, когда нам что то известно
        int []numbers = {2, 8, 4, 6,7};
        System.out.println(numbers [3]);
//        объявление массива, когда неизвестно что там
        int []numbers2 = new int[5];
        for (int i = 0; i<5; i++){
            System.out.println(numbers2 [i]);
        }
    }
}

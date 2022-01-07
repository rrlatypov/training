package lesson2;

public class Main1 {
    public static void main(String[] args) {
        byte a = 5;
        int b =  a;
        byte c = (byte) b;

        int money = 20;
        double gym = 2.8;
        int canGymBy = (int) (money / gym);
        System.out.println(canGymBy);
    }
}

package lesson2;

public class Main5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 5;
        if (a == b && b == c) {
            System.out.println("это равносторонний треугольник");


        } else if (a != b && b != c && c != a) {
            System.out.println("это разносторонний треугольник");

        } else {
            System.out.println("это равнобедренный треугольник");
        }
    }
}

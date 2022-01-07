package lesson2;

public class Main6 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int c = 6;
        if (a == b && b == c) {
            System.out.println("это равносторонний треугольник");


        } else if (a != b && b != c && c != a) {
            System.out.println("это разносторонний треугольник");

        }
        if ((a!=b && b==c)||(a==c&&b!=c)||(a==b&&b!=c)){
            System.out.println("это равнобедренный треугольник");
        }
    }
}

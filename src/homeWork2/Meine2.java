package homeWork2;

public class Meine2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        int d = 7;

        if ((a == b) && (b == c) && (c == d) && (d == a)) {
            System.out.println("у нас ромб или квадрат");
        }
        if ((a == c) && (b == d) && (a != b)) {
            System.out.println("у нас прямоугольник или параллелограмм");
        }
        if (((a == b) && (c == d)) || ((a == d) && (b == c))) {
            System.out.println("у нас дельтоид");
        } else {
            System.out.println("у нас другой четырехугольник");
        }

    }
}

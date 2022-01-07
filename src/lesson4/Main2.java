package lesson4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите фигуру");
        System.out.println("1-круг");
        System.out.println("2-квадрат");
        System.out.println("3-прямоугольник");
        System.out.println("4-треугольник");

        String inputFigura = scanner.nextLine();
        if (inputFigura.equals("1")) {
            System.out.println("введите радиус");
            String inputRadius = scanner.nextLine();
            int radius = Integer.parseInt(inputRadius);
            System.out.println("площадь круга равна:" + (radius * radius * 3.14));
            System.out.println("периметр круга равен: " + (radius * 2 * 3.14));

        } else if (inputFigura.equals("2")) {
            System.out.println("введите сторону");
            String inputStorona = scanner.nextLine();
            int storona = Integer.parseInt(inputStorona);
            System.out.println("площадь квадрата равна:" + (storona * storona));
            System.out.println("периметр равен:" + (storona * 4));

        } else if (inputFigura.equals("3")) {
            System.out.println("введите сторону а");
            String inputStoronaA = scanner.nextLine();
            System.out.println("введите сторону b");
            String inputStoronaB = scanner.nextLine();
            int storonaA = Integer.parseInt(inputStoronaA);
            int storonaB = Integer.parseInt(inputStoronaB);
            System.out.println("площадь прямоугольника равна:" + (storonaA * storonaB));
            System.out.println("периметр прямоугольника равен:" + ((storonaA * 2) + (storonaB * 2)));

        } else if (inputFigura.equals("4")) {
            System.out.println("введите сторону а");
            String inputStoronaA = scanner.nextLine();
            System.out.println("введите сторону b");
            String inputStoronaB = scanner.nextLine();
            System.out.println("введите сторону с");
            String inputStoronaC = scanner.nextLine();
            double storonaA = Integer.parseInt(inputStoronaA);
            double storonaB = Integer.parseInt(inputStoronaB);
            double storonaC = Integer.parseInt(inputStoronaC);
            double p = (storonaA+storonaB+storonaC)/2;
            System.out.println("площадь треугольника равна:" + (Math.sqrt(p*(p-storonaA)*(p-storonaB)*(p-storonaC))));

            System.out.println("периметр треугольника равен:" + (storonaA + storonaB + storonaC));

        } else {
            System.out.println("такой фигуры нет");
        }

    }
}

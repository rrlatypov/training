package byYourSelf;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        чуть отличается от оператора if
        Scanner scanner = new Scanner(System.in);
//        создали входной поток
        System.out.println(" введи возраст");
        int age = scanner.nextInt();
//        в age будем хранить то, что введем с клавиатуры. nextInt принимает цифры. могут вводиться разнуе возраста
        switch (age) {
//            перебираем возраста
            case 0:
//            условие, что возраст 0 лет, после case ставится двоеточие
                System.out.println(" ты родился");
//                после case ставится break, иначе будут выполняться остальные case
                break;
            case 7:
                System.out.println(" ты пошел в школу");
                break;
            case 18:
                System.out.println("ns закончил школу");
                break;
//                ставим default в случае если введенное число не соответствует нашим и если это наступило, то оно всегда будет выполнятся
            default:
                System.out.println(" ни одно условие не подошло");
//                если не ставим дефолт и не одно условие не подойдет, то программа остановится и ничего не выдаст



        }

    }
}

package lesson2;

public class Main7 {
    public static void main(String[] args) {
        int mark = 2;
        switch (mark) {
            case 1:
                System.out.println("ужас!");
                break;
            case 2:
                System.out.println("плохо!");
                break;
            case 3:
                System.out.println("не очень!");
                break;
            case 4:
                System.out.println("хорошо!");
                break;
            case 5:
                System.out.println("отлично!");
                break;
            default:
                System.out.println("это не оценка");
        }
    }
}

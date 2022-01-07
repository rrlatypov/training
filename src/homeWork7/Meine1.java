package homeWork7;

public class Meine1 {
    public static void main(String[] args) {
        Figura krug = new Figura();
        Figura oval = new Figura();
        Figura kvadrat = new Figura();

        krug.setPerimrter(20);
        oval.setPerimrter(30);
        kvadrat.setPerimrter(25);

        System.out.println("периметр круга - " + krug.getPerimrter());
        System.out.println("периметр овала - " + oval.getPerimrter());
        System.out.println("периметр квадрата - " + kvadrat.getPerimrter());

        krug.setPloschad(40);
        oval.setPloschad(50);
        kvadrat.setPloschad(45);

        System.out.println("площадь круга - " + krug.getPloschad());
        System.out.println("площадь овала - " + oval.getPloschad());
        System.out.println("площадь квадрата - " + kvadrat.getPloschad());

    }
}

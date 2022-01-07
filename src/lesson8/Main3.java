package lesson8;

public class Main3 {
    public static void main(String[] args) {
        FractionNumberImpl drobi = new FractionNumberImpl();
        drobi.setDividend(1);
        drobi.setDivisor(4);

        FractionNumber drob2 = new FractionNumberImpl();
        drob2.setDividend(2);
        drob2.setDivisor(5);

        System.out.println(drobi.value());

        System.out.println(drobi.toString());


    }
}

package lesson9;

public class Main3 {
    public static void main(String[] args) {
        lesson9.FractionNumberImpl drobi = new lesson9.FractionNumberImpl();

        drobi.setDividend(1);
        drobi.setDivisor(3);

        FractionNumberImpl drob2 = new FractionNumberImpl();
        drob2.setDividend(1);
        drob2.setDivisor(5);

        System.out.println(drobi.value());

        System.out.println(drobi.toString());

        System.out.println(drob2.value());

        System.out.println(drob2.toString());

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        lesson9.FractionNumber result = operation.add(drobi, drob2);
        FractionNumber result2 = operation.div(drobi, drob2);
        FractionNumber result3 = operation.mul(drobi, drob2);
        FractionNumber result4 = operation.sub(drobi, drob2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }
}

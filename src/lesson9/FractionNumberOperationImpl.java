package lesson9;

public class FractionNumberOperationImpl implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int commonDivident = a.getDividend() * commonDivisor / a.getDivisor() + b.getDividend() * commonDivisor / b.getDivisor();


        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(commonDivident);
        result.setDivisor(commonDivisor);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int commonDivident = a.getDividend() * commonDivisor / a.getDivisor() - b.getDividend() * commonDivisor / b.getDivisor();

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(commonDivident);
        result.setDivisor(commonDivisor);
        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int commonDivident = a.getDividend() * b.getDividend();


        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(commonDivident);
        result.setDivisor(commonDivisor);
        return result;

    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int commonDivisor = a.getDivisor() * b.getDividend();
        int commonDivident = a.getDividend() * b.getDivisor();
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(commonDivident);
        result.setDivisor(commonDivisor);
        return result;
    }
}

package lesson8;

public class FractionNumberImpl implements FractionNumber {
    private int divident;
    private int divisor;


    @Override
    public void setDividend(int dividend) {
        this.divident = dividend;

    }

    @Override
    public int getDividend() {
        return this.divident;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;


    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return this.divident/(double) this.divisor;
    }

    @Override
    public String toString() {
        return divident + "/" + divisor;
    }
}

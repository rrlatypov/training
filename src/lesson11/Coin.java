package lesson11;

public class Coin implements Comparable <Coin>{
    private int nominal;
    private int yesr;
    private double diametr;

    public Coin() {

    }

    public Coin(int nominal, int yesr, double diametr) {
        this.nominal = nominal;
        this.yesr = yesr;
        this.diametr = diametr;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYesr() {
        return yesr;
    }

    public void setYesr(int yesr) {
        this.yesr = yesr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (yesr != coin.yesr) return false;
        return Double.compare(coin.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        result = 31 * result + yesr;
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", yesr=" + yesr +
                ", diametr=" + diametr +
                '}';
    }

    @Override
    public int compareTo(Coin coin) {
        if (this.yesr !=coin.yesr){
            return this.yesr-coin.yesr;
        }
        if (this.nominal !=coin.nominal){
            return this.nominal-coin.nominal;
        }

        return Double.compare(this.diametr, coin.diametr);
    }
}

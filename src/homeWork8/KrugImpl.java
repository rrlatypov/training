package homeWork8;

public class KrugImpl implements Figura {
    private double radius;


    public void setRadius(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }


    @Override
    public double ploshad() {
        return 3.14*(this.radius * this.radius);
    }

    @Override
    public double perimetr() {
        return 2*3.14*this.radius;
    }

    @Override
    public void printFullInfo() {
        System.out.println(" площадь равна " + ploshad());
        System.out.println(" периметр равен " + perimetr());

    }
}



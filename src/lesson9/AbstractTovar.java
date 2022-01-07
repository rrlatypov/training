package lesson9;

public abstract class AbstractTovar implements Tovar {
    private int  price;
    private String name;
    private int count;


    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    public abstract void printKindTovar ();

}

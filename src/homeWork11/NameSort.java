package homeWork11;

public class NameSort extends Sort  {
    @Override
    public int compare(Kettle kettle, Kettle t1) {
        return kettle.getName().compareTo(t1.getName());

    }
}

package lesson8;

public class Tigr implements   Animal {
    public void voice() {
        System.out.println("rrrrrrrrr");
    }

    @Override
    public void run() {
        System.out.println("тигр бегает");
    }
}
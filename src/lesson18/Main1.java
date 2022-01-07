package lesson18;

public class Main1 {
    public static void main(String[] args) {
        Thread firstTread = new Thread(new FirstTread());
        firstTread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

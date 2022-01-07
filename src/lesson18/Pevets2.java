package lesson18;

public class Pevets2 extends Thread {
    @Override
    public void run() {

        while (true) {
            synchronized (Monitors.MICROFFON) {
                try {
                    Monitors.MICROFFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("FA-------");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MICROFFON) {
                Monitors.MICROFFON.notify();
            }
        }
    }
}

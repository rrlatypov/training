package lesson18;

public class Pevets1 extends Thread {


    @Override
    public void run() {

        int count = 0;
        while (true) {
            for (int i = 0; i < 4; i++) {
                System.out.println("------LA");
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MICROFFON) {
                Monitors.MICROFFON.notify();
            }

            synchronized (Monitors.MICROFFON) {
                try {
                    Monitors.MICROFFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            count++;
            if (count > 3) {
                break;
            }


        }
    }
}


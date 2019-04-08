package thread;

import java.util.Random;

/**
 * Vu
 */
public class StopThread implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        for(int i = 1; i < 100000; i++){
            System.out.println(i);
//            try {
//                Thread.sleep(random.nextInt(800) + 100);
//            } catch (InterruptedException e) {
//                System.out.println("Time's up");
//                break;
//            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new StopThread());
        t1.start();

        try {
            while (!Thread.interrupted()) {
                Thread.sleep(10);
                t1.interrupt();
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
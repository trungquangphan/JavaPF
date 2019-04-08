package thread;

import java.util.Timer;
import java.util.TimerTask;

class CanStop extends Thread {
    private boolean stop = false;
    private int counter = 0;
    public void run() {
        while (!stop && counter < 10000) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter++);
        }
        if (stop)
            System.out.println("Detected stop");
    }
    public void requestStop() {
        stop = true;
    }
}
public class Stopping {
    public static void main(String[] args) {
        final CanStop stoppable = new CanStop();
        stoppable.start();
        new Timer(true).schedule(new TimerTask() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Requesting stop");
                stoppable.requestStop();
            }
        }, 350);
    }
}
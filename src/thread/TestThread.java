package thread;

public class TestThread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exit");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Main-Thread");
        TestThread testThread = new TestThread();
        System.out.println(Thread.currentThread().getName() + " TestThread is going to run...");
        testThread.start();
        testThread.join();
        System.out.println(Thread.currentThread().getName() +" END");
    }
}

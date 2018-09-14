package oop.intro;

import java.util.Date;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();

        stopWatch.start();
        System.out.println(new Date()+ " - Bắt đâu đo tại startTime = " + stopWatch.getStartTime());


        System.out.println("Dừng 5s");
        doSomething(5);


        stopWatch.stop();
        System.out.println(new Date() + "Dừng đo tai endTime = " + stopWatch.getEndTime());

        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Thoi gian troi qua (millisecond): " + elapsedTime);

        Date date = new Date(stopWatch.getStartTime());
        System.out.println("Thoi gian he thong luc bắt đầu đo: " + date);
    }

    /**
     * Dừng chương trình trong ? giây.
     * Cụ thể làm như thế nào thì mấy đứa k cần biết.
     * @param second
     */
    public static void doSomething(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

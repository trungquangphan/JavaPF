package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncList {
    public static void main(String[] args) {
        List<Integer> syncList = new CopyOnWriteArrayList<>();


        List<Integer> nonSyncList = new ArrayList<>();
        Thread1 thread1 = new Thread1(nonSyncList);
        Thread2 thread2 = new Thread2(nonSyncList);
        thread1.start();
        thread2.start();
    }


}


class Thread1 extends Thread{
    private List<Integer> list;
    public Thread1(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run(){
        int count = 0;
        while(true){
            if (list.isEmpty()){
                list.add(count++);
            }
        }
    }
}
class Thread2 extends Thread{
    private List<Integer> list;
    public Thread2(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run(){
        while(true){
            if(!list.isEmpty()){
                int number = list.get(0);
                System.out.println(number);
                list.remove(0);
            }
        }
    }
}
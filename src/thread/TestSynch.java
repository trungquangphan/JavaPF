package thread;

class Table {
     void printTable(int n) { // synchronized method
         //Tai noi dung trang web
         synchronized(this){
            //luu du lieu bai nhac vao danh sach,
             //danh sach nay duoc ghi dong thoiboi nhieu thread
         }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class TestSynch{

    public static void main(String args[]) {
        Table obj = new Table();// tao mot object

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();

    }
}
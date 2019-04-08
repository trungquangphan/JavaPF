package oop.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        myList.display();
//
////        MyArrayList myList1 = new MyArrayList();
////        System.out.println(myList.clone());
//
//        List<String> arr = new ArrayList();
//        arr.add("1");
//        arr.add("2");
//        arr.add(2,"3");
//        System.out.println(arr);
//        List<String> arr1 = new LinkedList<>();
//        arr1.add("1");
//        arr1.add("2");
//        arr1.add(2,"3");
    }

}

class Number{
    private int val;

    public Number(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
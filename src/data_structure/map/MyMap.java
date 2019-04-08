package data_structure.map;

import oop.generic.Studen;

import java.util.*;


 //Depth-First Search

 //Breadth-First Search

public class MyMap {

    public static void main(String[] args) {

        Map<Number, Integer> mapa = new HashMap<Number, Integer>();



        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");


        Studen studen1 = new Studen();
        studen1.setName("Dung");
        Studen studen2 = new Studen();
        studen2.setName("Dung");

        System.out.println(studen1.equals(studen2));

        System.out.println("Hien thi cac phan tu cua map: " + map);

        /***
         * 1 - one
         * 2 - two
         * 3 - three
         */
        System.out.println("--------");
        Set<Integer> integerSet = map.keySet();
        for (Integer x: integerSet){
            System.out.println(x + " - " + map.get(x));
        }
        System.out.println("---Cach cua Van-----");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        System.out.println("--------");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> iter = iterator.next();
            System.out.println(iter.getKey() + " - " + iter.getValue());
        }

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    }
}

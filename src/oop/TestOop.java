package oop;

import oop.animal.Cat;
import oop.animal.Dog;

public class TestOop {
    String tiengChoCuaSangSua = "ec ec";
    String tiengChoSua = "gau gau";
    String tiengMeoKeu = "meo meo";
    /**
     * Chieu cao ma con meo treo dc trong cuoc thi
     */
    int height = 12;
    double balance;

    public static void main(String[] args) {
//        System.out.println("Lap trinh huong cau truc");
//        choSua();
//        choCuaSangSua();
//        meoKeu();
//        choSua();

        System.out.println("Lap trinh huong doi tuong");

        System.out.println("Dog biet sua:" + Dog.isBarkAbility());
        Dog normalDog = new Dog("gau gau","den");
        normalDog.sua();
        normalDog.mau();
        normalDog.nhuom("trang");
        System.out.println("Sau khi nhuom mau trang");
        normalDog.mau();

        Dog dogOfSang = new Dog("ec ec", "vang");
        dogOfSang.sua();
        dogOfSang.mau();




        dogOfSang.nhuom("vang bac");

        System.out.println("Sau khi nhuom mau vang bac");
        dogOfSang.mau();

//        Cat cat = new Cat("meo meo");
//        cat.keu();

    }

    private static void choCuaSangSua() {

        System.out.println("ec ec");
    }

    private static void meoKeu() {
        System.out.println("meo meo");
    }

    private static void choSua() {
        System.out.println("gau gau");
    }
}

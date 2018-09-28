package oop.polymorphism;

import oop.animal.Animal;
import oop.animal.Cat;
import oop.animal.Dog;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal cat = new Cat("gau gau");
        Animal cho = new Dog("meo meo","vang");
        kick(cho);
        kick(cat);
    }

    public static void kick(Animal animal){
        animal.keu();
    }

}
/***
 Quan he IS-A
 Quan he HAS-A
 */

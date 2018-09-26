package oop.inheritance;

import oop.animal.Animal;

public class TestInheritance {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setX(1);
        animal.setY(2);
        System.out.println("Original animal :"+animal);

        animal.setDistance(3);
        Animal newAnimal = animal.run();
        System.out.println("After run of newAnimal: " + newAnimal);
        newAnimal.run();
        System.out.println("After run of animal: " + animal);


        //cho Van, Loc k can xem
        System.out.println("After run of animal: " + newAnimal);

    }
}

/**
 *Van, Son:
 * 1,2,0
 * 4,5,3
 * 4,5,3
 * Loc, Sang:
 * 1,2,0
 * 1,2,3
 * 1,2,3
 * Dung, Vu:
 * 1,2,0
 * 4,5,3
 * 7,8,3
 * Hoang, Trung:
 * 1,2,0
 * 0,0,0
 * 4,5,3
 *
 */

package oop.access_modifiers;

import oop.animal.Dog;

public class DogManager {
    private Dog[] dogs;
    private int numberOfDog;


    public DogManager() {
        this.dogs = new Dog[10];
    }

    public void addDog(Dog dog){
        if(numberOfDog >= dogs.length ){
            dogs = new Dog[numberOfDog + 10];
            //copy array
        }
        dogs[numberOfDog] = dog;
        numberOfDog++;
    }
}

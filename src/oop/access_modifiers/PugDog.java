package oop.access_modifiers;

import oop.animal.Dog;

public class PugDog extends Dog {

    public PugDog(String voice, String colorOfFur) {
        super(voice, colorOfFur);
    }

    public PugDog() {
        this.name = "pugDog";
    }
}

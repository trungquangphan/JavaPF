package oop.intro;

public interface Movable {
    default void hello(){
        System.out.println("hehehehe");
    }

    void moveOfInterface();
}

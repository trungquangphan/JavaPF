package oop.generic;

public interface MyList<T> {

    default void display(){
        System.out.println("hello");
    }

    T clone();
}

package oop.exercise.cake;

public class Car extends Vehicle{
    @Override public double getPrice() {
        System.out.println("Tinh gia xe");
        return 100;
    }

    @Override public double calcPrice() {
        return getPrice();
    }

    @Override public int getDiscount() {
        return 0;
    }
}

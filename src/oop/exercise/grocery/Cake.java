package oop.exercise.grocery;

public abstract class Cake extends Item {
    protected String name;
    protected double rate;
    protected final int DISCOUNT_IN_PERCENT = 20;
    public Cake (String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Cake (Cake cake) {
        this.name = cake.name;
        this.rate = cake.rate;
    }

    public String toString () {
        return name + "\t" + rate;
    }
}
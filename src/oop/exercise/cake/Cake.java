package oop.exercise.cake;

public abstract class Cake implements Price {
    protected String name;
    protected double rate;
    public Cake () {};
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
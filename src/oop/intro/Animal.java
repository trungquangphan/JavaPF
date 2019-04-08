package oop.intro;

public abstract class Animal implements Movable{
    private int x;
    private int y;

    public abstract void move();

    public void show() {
        System.out.println(this.getClass().getName() + " has position: " + this.x+ ", " + this.y);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

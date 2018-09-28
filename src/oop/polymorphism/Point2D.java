package oop.polymorphism;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public Point2D(){}


    public Point2D(Point2D point2D){
        this.x = point2D.getX();
        this.y = point2D.getY();
    }


    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {

        return x;
    }

    public float getY() {
        return y;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float [] getXY (){
        float [] arr= new float [2];
        arr[0]=this.x;
        arr[1]= this .y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
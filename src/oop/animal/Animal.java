package oop.animal;

public class Animal {
    private String voice;

    private String howToCall;

    private int x,y, distance;

    public Animal() {
    }

    public Animal(String voice) {
        this.voice = voice;
    }

    public void keu(){
        System.out.println("Voice: " + this.voice);
    }

    public Animal run(){
        this.x += distance;
        this.y += distance;
        return new Animal();
    }

    @Override public String toString() {
        return "Animal{" +
                "voice='" + voice + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", distance=" + distance +
                '}';
    }

    /**
     * Below is the get set section
     */

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }


    protected String getHowToCall(){
        return this.howToCall;
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

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}

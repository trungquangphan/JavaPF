package oop.intro;

public class ChoTa extends Dog{
    private String song;

    public ChoTa(String song) {
        super();
        this.song = song;
    }

    public ChoTa(String name, String colorOfFur, String sound, String song) {
        super(name, colorOfFur, sound);
        this.song = song;
    }

    @Override
    public void bark() {
        System.out.println(getName() + " sua " + getSound() +", hat " + this.song);
    }

    public void sing(){
        System.out.println(getName() + " hat " + this.song);
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}

package oop;

public class Cat {
    private String voice;
    int height;

    public Cat(String voice){
        this.voice = voice;
    }


    public void keu(){
        System.out.println(voice);
    }

    public void treo(){
        System.out.println("treo " + height + " m");
    }
}

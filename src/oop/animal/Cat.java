package oop.animal;

public class Cat extends Animal {

    int height;



    public Cat(String voice) {
        super(voice);
    }

    public Cat(String voice, int height){
        super(voice);
        this.height = height;
    }

    @Override
    public void keu(){
        //phat ra tieng keu
       System.out.println("con meo keu: " + this.getVoice());
    }


    public void treo(){
        System.out.println("treo " + height + " m");
    }
//
//    @Override public String toString() {
//        return "Cat{" +
//                "voice=" + this.getVoice() +
//                "height=" + height +
//                '}';
//    }
}
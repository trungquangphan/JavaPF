package oop;

public class Dog {
    //attribute, field, property
    private String voice;

    public String colorOfFur;

    //constructor
    public Dog(String voice, String colorOfFur){
        this.voice = voice;
        this.colorOfFur = colorOfFur;
    }

    //behavior, method, function
    public void mau(){
        System.out.println("mau long : " + colorOfFur);

    }
    public void sua(){
        System.out.println(voice);
    }

    /**
     * Phuong thuc này cho phép nhuộm màu lông của con cho
     * @param colorOfFur
     */
    public void nhuom(String colorOfFur) {
        if("gau gau".equals(voice)){
            this.colorOfFur = colorOfFur;
        }
    }

    public String getColorOfFur(){
        return this.colorOfFur;
    }


    public String getVoice(){
        return voice;
    }
}

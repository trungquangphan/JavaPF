package oop.animal;

public class Dog {
    //attribute, field, property
    private String voice;

    public static String colorOfFur;

    protected String name;

    //A dog can bark or not
    private static boolean barkAbility = true;

    public Dog() {
    }

    //constructor
    public Dog(String voice, String colorOfFur){
        this.voice = voice;
        this.colorOfFur = colorOfFur;
    }

    public static boolean isBarkAbility() {
        return barkAbility;
    }

    //behavior, method, function
    public void mau(){
        System.out.println("mau long : " + colorOfFur);

    }
    public void sua(){
        System.out.println(this.voice);
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

    class ChihuahuaDog{

    }
}


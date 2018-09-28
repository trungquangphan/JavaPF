package oop.animal;

public class Dog extends Animal{
    public static String colorOfFur;

    protected String name;

    //A dog can bark or not
    private static boolean barkAbility = true;

    public Dog() {
        super();
    }

    //constructor
    public Dog(String voice, String colorOfFur){
        super(voice);
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
        System.out.println(this.getVoice());
    }

    /**
     * Phuong thuc này cho phép nhuộm màu lông của con cho
     * @param colorOfFur
     */
    public void nhuom(String colorOfFur) {
        if("gau gau".equals(this.getVoice())){
            this.colorOfFur = colorOfFur;
        }
    }

    @Override public void keu() {
        System.out.println("Con cho keu: "+ this.getVoice());
    }

    public String getColorOfFur(){
        return this.colorOfFur;
    }

}


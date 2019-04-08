package oop.intro;

public class Dog extends Animal{
    //class variable, attribute, property
    private String name;
    protected String colorOfFur;
    private String sound;//gaugau, angang
    private static String owner = "trung";

    public Dog(){
    }


    public Dog(String name, String colorOfFur, String sound) {
       this.name = name;
       this.colorOfFur =colorOfFur;
       this.sound = sound;
    }

    //method, action, behaviour
    public void bark() {
        System.out.println(this.name + " sua " + this.sound);
    }

    //setter
    public void setSound(String sound) {
        if("gaugau".equals(sound) || "angang".equals(sound)) {
            this.sound = sound;
        } else {
            System.out.println("Tieng sua ["+sound+"]khong hop le");
        }
    }

    //Getter
    public String getSound(){
        return this.sound;
    }

    public String getName() {
        return name;
    }

    public String getColorOfFur() {
        return colorOfFur;
    }

    public static String getOwner() {
        return owner;
    }

    @Override public void move() {
        System.out.println("Dog is moving with 4 foots");
    }

    @Override public void moveOfInterface() {

    }
}




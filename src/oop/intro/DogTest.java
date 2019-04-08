package oop.intro;

public class DogTest{


    public static void main(String[] args) {

        //Data_Type name_of_variable = new Data_Type();

//        Animal dog = new Dog();
//        dog.setX(1);
//        dog.setY(2);
//
//        dog.show();
//        dog.move();
//
//        Animal chicken = new Chicken();
//        chicken.setX(3);
//        chicken.setY(4);
//        chicken.show();
//        chicken.move();


        Movable movable = new ChoTa("s");
        ((ChoTa) movable).sing();

        if (movable instanceof ChoTa) {
            ((ChoTa) movable).sing();
        }




    }


}
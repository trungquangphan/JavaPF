package oop.exercise.cake;

public class ReadyMadeCake extends Cake{
    public int quantity;
    public ReadyMadeCake(String name, double rate,int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }
    public ReadyMadeCake(Cake cake){
        super(cake);
        if (cake instanceof ReadyMadeCake) {
            this.quantity = ((ReadyMadeCake) cake).quantity;
        }
    }
    public double calcPrice () {
        return rate * quantity;
    }

    @Override public int getDiscount() {
        return 0;
    }

    public String toString () {
        return super.toString() + "\t" + quantity +"cakes";
    }
}
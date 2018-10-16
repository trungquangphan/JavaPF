package oop.exercise.cake;

public class OrderCake extends Cake{
    private  double weight;
    public OrderCake (String name, double rate, double weight) {
        super(name,rate);
        this.weight = weight;
    }
    public OrderCake (Cake cake){
        super(cake);
        if (cake instanceof OrderCake){
            this.weight = ((OrderCake) cake).weight;
        }
    }
    public double calcPrice () {
        return rate * weight;
    }

    @Override public int getDiscount() {
        return 0;
    }

    public String toString () {
        return super.toString() + "\t" + weight + "kg";
    }
}

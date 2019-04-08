package oop.exercise.grocery;

public class OrderCake extends Cake {
    private final String[] SUPPORTED_DISCOUNT_CONDITIONS = {"NameOfCustomerCondition"};


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

    @Override public double getPrice() {
        return calcPrice();
    }

    @Override
    public double getDiscount(DiscountCondition[] discountConditions) {
        double discountAmount = 0;

        if(weight > 1){
            discountAmount += DISCOUNT_IN_PERCENT/100*this.getPrice();
        }
        discountAmount += this.getBaseDiscount(discountConditions);
        return discountAmount;
    }

    @Override public String getInfo() {
        return toString() + ", price: " + getPrice();
    }

    @Override public String[] getSupportedDiscountConditions() {
        return SUPPORTED_DISCOUNT_CONDITIONS;
    }

    public String toString () {
        return super.toString() + "\t" + weight + "kg";
    }
}

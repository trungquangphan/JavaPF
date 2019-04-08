package oop.exercise.grocery;

public class ReadyMadeCake extends Cake {
    private final String[] SUPPORTED_DISCOUNT_CONDITIONS = {"NameOfCustomerCondition"};

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

    @Override public double getPrice() {
        return calcPrice();
    }

    @Override public double getDiscount(DiscountCondition[] discountConditions) {
        double discountAmount = 0;

        if(quantity > 5){
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
        return super.toString() + "\t" + quantity +" (eggs)";
    }
}
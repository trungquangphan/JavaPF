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
        //We should not check the discount condition if it is empty
        if(discountConditions == null || discountConditions.length ==0 ){
            return discountAmount;
        }
        for (DiscountCondition discountCondition : discountConditions) {
            if(supportDiscountCondition(discountCondition)){
                /**
                 * We are at OrderCake class, we know how to calculate the discount for these items
                 */

                if(discountCondition instanceof NameOfCustomerCondition){
                    NameOfCustomerCondition nameOfCustomerCondition = (NameOfCustomerCondition) discountCondition;
                    if(nameOfCustomerCondition.willGetDiscount()){
                        discountAmount += nameOfCustomerCondition.getDiscountAmount();
                    }
                }

            }
        }
        return discountAmount;
    }

    @Override public String getInfo() {
        return toString() + ", price: " + getPrice();
    }

    @Override public boolean supportDiscountCondition(DiscountCondition discountCondition) {
        for (String supported_discount_condition : SUPPORTED_DISCOUNT_CONDITIONS) {
            if( supported_discount_condition.equals(discountCondition.getNameOfCondition())){
                return true;
            }
        }
        return false;
    }

    public String toString () {
        return super.toString() + "\t" + weight + "kg";
    }
}

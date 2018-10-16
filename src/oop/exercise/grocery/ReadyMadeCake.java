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
        //We should not check the discount condition if it is empty
        if(discountConditions == null || discountConditions.length ==0 ){
            return discountAmount;
        }
        for (DiscountCondition discountCondition : discountConditions) {
            if(supportDiscountCondition(discountCondition)){
                /**
                 * We are at ReadyMadeCake class, we know how to calculate the discount for these items
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
        return super.toString() + "\t" + quantity +" (eggs)";
    }
}
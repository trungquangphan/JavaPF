package oop.exercise.grocery;

public abstract class Item implements ItemPrice, ItemDiscount{

    public abstract String getInfo();

    protected double getBaseDiscount(DiscountCondition[] discountConditions) {
        double discountAmount = 0;
        //We should not check the discount condition if it is empty
        if(discountConditions == null || discountConditions.length ==0 ){
            return discountAmount;
        }
        for (DiscountCondition discountCondition : discountConditions) {
            if(supportDiscountCondition(discountCondition)){
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

    @Override public boolean supportDiscountCondition(DiscountCondition discountCondition) {
        for (String supported_discount_condition : getSupportedDiscountConditions()) {
            if( supported_discount_condition.equals(discountCondition.getNameOfCondition())){
                return true;
            }
        }
        return false;
    }

    protected abstract String[] getSupportedDiscountConditions();
}

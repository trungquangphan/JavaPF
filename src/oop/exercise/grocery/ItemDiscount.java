package oop.exercise.grocery;

public interface ItemDiscount {
    double getDiscount(DiscountCondition[] discountConditions);
    boolean supportDiscountCondition(DiscountCondition discountCondition);
}

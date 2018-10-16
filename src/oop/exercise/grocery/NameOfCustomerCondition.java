package oop.exercise.grocery;

public class NameOfCustomerCondition implements DiscountCondition{
    private String nameOfCustomer;
    //Customers who has below name can get discounted price
    private String discountName;
    private double discountAmount;

    public NameOfCustomerCondition(String nameOfCustomer, String discountName, double discountAmount) {
        this.nameOfCustomer = nameOfCustomer;
        this.discountName = discountName;
        this.discountAmount = discountAmount;
    }

    public boolean willGetDiscount(){
        return nameOfCustomer != null && nameOfCustomer.equals(discountName);
    }

    @Override public String getNameOfCondition() {
        return "NameOfCustomerCondition";
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}

package oop.exercise.grocery;

import java.util.Date;

public class DiscountBill extends GroceryBill{
    private boolean preferred;

    private static DiscountCondition[] discountConditions;

    public DiscountBill(Customer customer, Date dateOfOrder, boolean preferred) {
        super(customer, dateOfOrder);
        this.preferred = preferred;

        /**
         * Set up discountConditions because DiscountBill will apply some discount which depends on some conditions.
         */
        if(preferred){
            discountConditions = new DiscountCondition[2];
            discountConditions[0] = new NameOfCustomerCondition(customer.getName(),"peter", 30);
            discountConditions[1] = new DateOfOrderCondition(dateOfOrder);
        }
    }

    /**
     * Receipt of DiscountBill is different from GroceryBill because it needs to show discount items information, then we have to override printReceipt method
     */
    public void printReceipt(){
        System.out.println("-------------Receipt----------");
        System.out.println("Bill at date: " + getDateOfOrder());
        System.out.println("Customer: " + getCustomer().getName());
        System.out.println("Address: " + getCustomer().getAddress());
        System.out.println("Phone number: " + getCustomer().getPhone());
        System.out.println("Preferred: " + preferred);
        System.out.println("--- LIST OF ITEMS---");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Item  " + i);
            System.out.println(items[i].getInfo());
            System.out.println("Discounted amount: " + items[i].getDiscount(discountConditions));
            System.out.println("----");

        }
        System.out.println("Total: " + getTotal());
        System.out.println("Total after discount: " + (getTotal() - getDiscountAmount()));
        System.out.println("Number of items which have discounted: " + getDiscountCount());
        System.out.println("Total discount amount in percent: " + getDiscountPercent());
    }


    public double getDiscountCount(){
        int count = 0;
        for (int i = 0; i < numberOfItems; i++) {
            double discountedAmount = items[i].getDiscount(discountConditions);
            if(discountedAmount > 0){
                count ++ ;
            }
        }
        return count;
    }

    public double getDiscountAmount(){
        int discountedAmountTotal = 0;
        for (int i = 0; i < numberOfItems; i++) {
            discountedAmountTotal += items[i].getDiscount(discountConditions);
        }
        return discountedAmountTotal;
    }

    public double getDiscountPercent(){
        return getDiscountAmount()/getTotal()*100;
    }


}

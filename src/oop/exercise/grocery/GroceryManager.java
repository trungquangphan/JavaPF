package oop.exercise.grocery;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GroceryManager {

    private static Date createDate(String dateInString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dateInString);
    }

    public static void main(String[] args) throws ParseException {

        /**
         * 1.Create items for grocery
         */
        Item orderCake = new OrderCake("order cake", 1, 20);
        Item readyMadeCake = new ReadyMadeCake("ready made cake", 2, 6);
        Item winterShoe = new Shoe(ShoeType.WINTER, "winter shoe", 40, 100, 20);
        Item summerShoe = new Shoe(ShoeType.SUMMER, "summer shoe", 38, 100, 30);

        /**
         * Tom is normal customer, he buys OrderCake and SummerShoe
         */
        Customer tom = new Customer("tom", "113", "da nang");
        Date dateOfTomsOrder = createDate("12/10/2018");
        GroceryBill groceryBill = new GroceryBill(tom, dateOfTomsOrder);
        groceryBill.add(orderCake);
        groceryBill.add(summerShoe);
        groceryBill.printReceipt();

        /**
         * Peter is preferred customer, he buys winter shoe and ReadyMadeCake
         */
        Customer peter = new Customer("peter", "456", "da nang");
        Date dateOfPetersOrder = createDate("12/5/2018");
        GroceryBill discountBill = new DiscountBill(peter, dateOfPetersOrder, true);
        discountBill.add(readyMadeCake);
        discountBill.add(winterShoe);
        discountBill.printReceipt();

    }

}

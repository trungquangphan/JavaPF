package oop.exercise.grocery;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GroceryBill {
    private Customer customer;
    private Date dateOfOrder;
    protected Item[] items = new Item[10];
    protected int numberOfItems = 0;

    public GroceryBill(Customer customer, Date dateOfOrder) {
        this.customer = customer;
        this.dateOfOrder = dateOfOrder;
    }

    public void add(Item item){
        if(numberOfItems > items.length){
            items = Arrays.copyOf(items, items.length + 10);
        }
        items[numberOfItems++] = item;
    }

    public double getTotal(){
        double total = 0;
        for (int i = 0; i < numberOfItems; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void printReceipt(){
        System.out.println("-------------Receipt----------");
        System.out.println("Bill at date: " + dateOfOrder);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone number: " + customer.getPhone());
        System.out.println("----------- LIST OF ITEMS -------------");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(items[i].getInfo());
        }
        System.out.println("Total: " + getTotal());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
}

package oop.exercise.grocery;

import java.util.Date;

public class DateOfOrderCondition implements DiscountCondition {
    private Date dateOfOrder;

    public DateOfOrderCondition(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @Override public String getNameOfCondition() {
        return "DateOfOrderCondition";
    }
}

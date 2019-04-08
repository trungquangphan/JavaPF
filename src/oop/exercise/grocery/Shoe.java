package oop.exercise.grocery;

public class Shoe extends Item{
    private ShoeType shoeType;
    private String name;
    private int size;
    /**
     * Change name of properties: price to priceOfShoe, discount to discountOfShoe
     * to avoid having getter methods which have same method name as in interface Item.
     */
    private int priceOfShoe;
    private int discountOfShoe;

    private final String[] SUPPORTED_DISCOUNT_CONDITIONS = {"DateOfOrderCondition","NameOfCustomerCondition"};

    public Shoe(ShoeType shoeType, String name, int size, int priceOfShoe, int discount) {
        this.shoeType = shoeType;
        this.name = name;
        this.size = size;
        this.priceOfShoe = priceOfShoe;
        this.discountOfShoe = discount;
    }

    @Override public double getPrice() {
        return priceOfShoe;
    }

    @Override public double getDiscount(DiscountCondition[] discountConditions) {
        double discountAmount = 0;
        //We should not check the discount condition if it is empty
        if(discountConditions == null || discountConditions.length ==0 ){
            return discountAmount;
        }
        for (DiscountCondition discountCondition : discountConditions) {
            if(supportDiscountCondition(discountCondition)){
                /**
                 * We are at Shoe class, we know how to calculate the discount for shoe items
                 */
                if(discountCondition instanceof DateOfOrderCondition){
                    DateOfOrderCondition dateOfOrderCondition = (DateOfOrderCondition) discountCondition;
                    if((dateOfOrderCondition.getDateOfOrder().getMonth() > 3 && dateOfOrderCondition.getDateOfOrder().getMonth() < 7  && shoeType == ShoeType.WINTER) || (dateOfOrderCondition.getDateOfOrder().getMonth() > 9 && dateOfOrderCondition.getDateOfOrder().getMonth() < 1  && shoeType == ShoeType.SUMMER)){
                        discountAmount += discountOfShoe;
                    }
                }

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
        return "Shoe: shoeType=" + shoeType +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", priceOfShoe=" + priceOfShoe;
    }

    @Override public String[] getSupportedDiscountConditions() {
        return SUPPORTED_DISCOUNT_CONDITIONS;
    }

    public int getPriceOfShoe() {
        return priceOfShoe;
    }

    public void setPriceOfShoe(int priceOfShoe) {
        this.priceOfShoe = priceOfShoe;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDiscountOfShoe() {
        return discountOfShoe;
    }

    public void setDiscountOfShoe(int discountOfShoe) {
        this.discountOfShoe = discountOfShoe;
    }

}

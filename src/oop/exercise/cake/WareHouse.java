package oop.exercise.cake;

//Contain cakes + vehicles
public class WareHouse {
    public static void main(String[] args) {
        Cake readyMadeCake = new ReadyMadeCake("Ready Made Cake", 1, 1);
        Cake orderCake = new OrderCake("Order Cake", 1, 0.5);
        double totalPriceOfCakes = readyMadeCake.calcPrice() + orderCake.calcPrice();

        Vehicle car = new Car();
        double totalPriceOfCars = car.calcPrice();

        Cake[] cakes = new Cake[100];
        Vehicle[] vehicles = new Vehicle[100];

        Price[] products = new Price[10000];
        products[0] = readyMadeCake;
        products[1] = orderCake;
        products[2] = car;

        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].calcPrice();
        }


    }
}

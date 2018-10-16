package oop.exercise.cake;

import java.util.Scanner;

/**
 * Cloned from Son's Github repository
 * Source:https://github.com/vuhson30799/OOP/tree/master/src/Cake
 *
 */
public class CakeTest {
    static Scanner scanner= new Scanner (System.in);

    private Cake[] cakes = new Cake[20];
    public static int index = 0;
    public Cake makeOrderCake () {
        System.out.println("enter cake's name: ");
        String name = scanner.nextLine();
        System.out.println("enter its rate: ");
        double rate = scanner.nextDouble();
        System.out.println("enter its weight: ");
        double weight = scanner.nextDouble();
        return  new OrderCake(name, rate, weight);
    }
    public Cake makeReadyMadeCake () {
        System.out.println("input name of cake: ");
        String name = scanner.nextLine();
        System.out.println("input rate of cake: ");
        double rate = scanner.nextDouble();
        System.out.println(" input quantity of cake: ");
        int quantity = scanner.nextInt();
        return new ReadyMadeCake(name,rate,quantity);
    }
    public double totalPriceOfAllCakes(){
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += cakes[i].calcPrice();
        }
        return total;
    }
    public double totalPriceOfReadyMadeCake() {
        double total = 0;
        for (int i = 0; i < index ; i++) {
            if(cakes[i] instanceof  ReadyMadeCake){
                total += cakes[i].calcPrice();
            }
        }
        return total;

    }
    public int quantityOfReadyMadeCakeSold(){
        int quantity = 0;
        for (int i = 0; i < index; i++) {
            if(cakes[i] instanceof ReadyMadeCake){
                quantity += ((ReadyMadeCake) cakes[i]).quantity;
            }
        }
        return quantity;
    }
    public Cake searchInfoHighestPriceCake (){
        double price = 0, max =0;
        int index = 0;
        for (int i = 0; i < this.index ; i++) {
            price = cakes[i].calcPrice();
            if (max < price) {
                max = price;
                index = i;
            }
        }
        return cakes[index];
    }
    public void addCake (Cake cake){
        if (index < cakes.length) {
            cakes[index] = cake;
            index++;
        }else{
            System.out.println("Array cakes is oversize");
        }
    }

    public static void main(String[] args) {


        CakeTest cakeManager = new CakeTest();
        for (int i = 0; i < 3; i++) {
            System.out.println("Choose what cake to enter data: ");
            String data = scanner.nextLine();
            if (data.equals("ReadyMadeCake")){
                Cake cake = cakeManager.makeReadyMadeCake();
                cakeManager.addCake(cake);
                scanner.nextLine();
            }else if (data.equals("OrderCake")){
                Cake cake = cakeManager.makeOrderCake();
                cakeManager.addCake(cake);
                scanner.nextLine();
            }else{
                System.out.println("We don't have this cake. Enter again!!");
                i--;
            }
        }
        for (Cake x: cakeManager.cakes) {
            System.out.println(x);
        }
        System.out.println("The total price sold for all cakes: " + cakeManager.totalPriceOfAllCakes());

        System.out.println(" The total price sold for ready made cake: " + cakeManager.totalPriceOfReadyMadeCake());

        System.out.println(" The quantity sold for ready made cake: " + cakeManager.quantityOfReadyMadeCakeSold());

        System.out.println(" The cake has been sold for the highest price is: " + cakeManager.searchInfoHighestPriceCake());
    }
}

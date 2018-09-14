package general;

public class Condition {

    public static void main(String[] args) {
        System.out.println(compare(10));
    }

    public static int compare(int n) {
       if(n>=1){
           return 1;
       }else {
           return 0;
       }
    }

    private static boolean isZero(int n) {
        System.out.println("isZero: Checking n = " + n);
        return n==0;
    }

    private static boolean isOne(int n) {
        System.out.println("isOne: Checking n = " + n);
        return n==1;
    }

}



























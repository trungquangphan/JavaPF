package method;

public class HelloMethod {

    public static void main(String[] args) {
        System.out.println(giaiThua(4));
    }

    public static int giaiThua(int n) {
        if(n==0||n==1){
            return 1;
        }else
            return n*giaiThua(n-1);
    }

}



























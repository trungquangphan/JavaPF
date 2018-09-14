package condition;

import java.util.Arrays;

public class ConditionExercises {

    public static void main(String[] args) {
        int[] a = {0,1};
        System.out.println(a);
        int [] b = {2,3};
        System.out.println(b);
        int[] c = b;
        b = a;
        System.out.println(b);
        System.out.println(c);



        int x = 0;
        int y = 1;
        int z = y;
        y = x;

        System.out.println(y);
        System.out.println(z);
    }
}

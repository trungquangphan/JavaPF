package loop;

/***
 * There are many types of looping in java:
 * for, while, do-while, forEach
 */

public class ForLooping {
     public static void main( String[] args) {

         int i=1,j=2;
        while(true){
            if (i==5){
                i++;
                continue;
            }
            System.out.printf("%d*%d=%d\n",i,j,i*j);
            i++;
            if (i==10 ){
                break;
            }
        }
    }
}

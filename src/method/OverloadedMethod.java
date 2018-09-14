package method;

public class OverloadedMethod {
    public static void main(String [] args) {
       int[] matrixA = null;
       int[] matrixB = null;
//       int[] result = add(matrixA, matrixB);

       int[] arr = {10,20,30,40,50,60};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

//    private static int[] add(int[] matrixA, int[] matrixB) {
//        //thực hiện phép cộng mảng
//        return new int[0];
//    }

    private static int[] add(int[] ... matrixes) {
        //thực hiện phép cộng mảng
        int[] sum = null;
        for (int[] matrix : matrixes) {
            sum = add(null , matrix);
        }
        return sum;
    }

}

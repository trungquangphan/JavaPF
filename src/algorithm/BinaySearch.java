package algorithm;

public class BinaySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,89};
        System.out.println(binarySearchUsingRecursion(arr,8, arr.length-1, 0));
    }

    private static boolean binarySearchUsingRecursion(int[] arr, int value, int height, int low) {
        if(height < low){
            return false;
        }
        int mid = (height + low) /2;
        if(arr[mid] == value){
            return true;
        }else if (arr[mid] > value){
            return binarySearchUsingRecursion(arr, value, mid - 1, low);
        }else{
            return binarySearchUsingRecursion(arr, value, height, mid + 1);
        }
    }
}

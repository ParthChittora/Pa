public class MinAndMaxUsingRecursion {
//    Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.
//    Input: arr = {1, 4, 3, -5, -4, 8, 6};
//    Output: min = -5, max = 8
    public static int minVal(int[] arr,int size){
        if(size==1){
            return arr[0];
        }
        return Math.min(arr[size-1],minVal(arr,size-1));
    }
    public static int maxVal(int[] arr,int size){
        if(size==1){
            return arr[0];
        }
        return Math.max(arr[size-1],maxVal(arr,size-1));
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,765,-90};
        System.out.println(minVal(arr,arr.length));
        System.out.println(maxVal(arr,arr.length));
    }
}

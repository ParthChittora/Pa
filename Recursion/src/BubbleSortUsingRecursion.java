import java.util.Arrays;

public class BubbleSortUsingRecursion {

    public static void swap(int[]arr , int a , int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }
    //    method1
    public static void bubSort(int[] arr, int n) {
        if (n == 1) {
            return ;
        }
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                count++;
            }
        }
        if (count == 0) {
            return ;
        }
        bubSort(arr,n-1);
    }
    //    method2
    public static void bubSort2(int[] arr, int r , int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1])
                swap(arr,c,c+1);
            bubSort2(arr,r,c+1);
        }
        else bubSort2(arr,r-1,0);
    }

    public static void main(String[] args) {
        int[] arr = {-1,-4,67,73,7,2};
//        bubSort(arr,arr.length);
//        System.out.println(Arrays.toString(arr));
        bubSort2(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}


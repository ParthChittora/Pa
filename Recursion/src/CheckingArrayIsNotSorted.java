public class CheckingArrayIsNotSorted {
   public static boolean arraySortedOrNot(int[] arr, int n)
    {
        if (n == 1 || n == 0)
            return true;
        if (arr[n - 1] < arr[n - 2])
            return false;
        return arraySortedOrNot(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
        System.out.println(arraySortedOrNot(arr,n));
    }
}

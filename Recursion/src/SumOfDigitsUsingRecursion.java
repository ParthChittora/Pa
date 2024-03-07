public class SumOfDigitsUsingRecursion {
    public static int sumDig(int n){
        if(n<10 )
            return n;
        return (n%10)+sumDig(n/10);
    }

    public static void main(String[] args) {
        int ip = 1250623;
        System.out.println(sumDig(ip));
    }
}

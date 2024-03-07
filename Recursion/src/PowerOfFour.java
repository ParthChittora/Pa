public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        if(n==1) return true;
        return n%4==0&&isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        int a = 256;
        System.out.println(isPowerOfFour(a));
    }
}

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        else if(n<3)
            return false;
        return n%3==0&&isPowerOfThree(n/3);
    }

    // public boolean isPowerOfThree(int n) {
    //     if (n == 1){return true;}
    //     if (n%3 != 0 || n == 0) {
    //         return false;
    //     }
    //     return isPowerOfThree(n/3);
    // }
    public static void main(String[] args) {
        int ip = 465;
        System.out.println(isPowerOfThree(ip));
    }
}

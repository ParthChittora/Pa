public record PowerOfTwo() {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        if(n==1) return true;
        return n%2==0&&isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
        int ip = 68;
        System.out.println(isPowerOfTwo(ip));
    }
}

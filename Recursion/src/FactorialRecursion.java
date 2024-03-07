public class FactorialRecursion {
    public static int fact(int n){
        if(n<=1)
            return n;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int ip = 6;
        System.out.println(fact(ip));
    }
}

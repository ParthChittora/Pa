public class SumOfNaturalNumbers {
    public static int sumNatural(int n) {
        if (n < 1) {
            return 0;
        }
        return n+sumNatural(n-1);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(sumNatural(a));
    }
}

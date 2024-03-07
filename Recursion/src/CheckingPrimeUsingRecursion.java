public class CheckingPrimeUsingRecursion {
    public static boolean isPrime(int n, int i) {

        // Base cases
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    // Driver program to test above function
    public static void main(String[] args) {
        int n = 15;
        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
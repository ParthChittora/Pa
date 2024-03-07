import java.util.Scanner;
public class SpecialFibonacci {
//    https://www.codechef.com/problems/FIBXOR01/?tab=solution
//    A XOR 0 = A
//    A XOR A = 0
    public static int fibonacci(int a, int b, int n) {
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else if (n == 2) {
            return a ^ b;
        }
        return fibonacci(a, b, n % 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println();
            System.out.println(fibonacci(a, b, n));
        }
    }
}

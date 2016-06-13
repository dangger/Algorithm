import java.util.Scanner;

public class Fibonacci {

    static int[] fibarr = new int[1000];

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(Fib(n));
    }

    /*
    public static int Fib (int n) {
        int f0, f1, f2;
        f0 = f1 = f2 = 1;

        for (int i = 2; i <= n; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }

        return f2;
    }
    */

    public static int Fib (int n) {
        int t = 0;

        if (fibarr[n] != 0) return fibarr[n];
        if (n == 0 || n == 1) t = 1;
        if (n > 1) t = Fib(n - 1) + Fib(n - 2);

        return fibarr[n] = t;
    }
}

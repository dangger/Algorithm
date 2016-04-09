public class Fibonacci {

    public static void F(long *f, int n) {
        int f0, f1, f2;
        f0 = f1 = 1;

        for (int i = 2; i <= n; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }

        System.out.printf("f[%d] = %d\n" , n, f2);
    }
}

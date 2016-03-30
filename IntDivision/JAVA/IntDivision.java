import java.util.Scanner;

public class IntDivision {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter n = ");
        */
        int n = sc.nextInt();

        System.out.println(fun(n, n));
    }

    public static int fun(int n, int m) {
        if (n < 1 || m < 1) {
            return 0;
        } else if (n == 1 || m == 1) {
            return 1;
        } else if (n < m) {
            return fun(n, n);
        } else if (n == m) {
            return fun(n, m - 1) + 1;
        }

        return fun(n, m - 1) + fun(n - m, m);
    }
}

import java.util.Scanner;

public class Ackerman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n;

        System.out.print("This is a Ackerman function.\n"
                + "Please enter n and m:\n");
        System.out.print("n = ");
        n = in.nextInt();
        System.out.print("m = ");
        m = in.nextInt();

        System.out.printf("Ackerman(%d,%d) = %d\n", 
                n, m, ackerman(n, m));
    }

    public static int ackerman(int n, int m) {
        int r = 0;

        if (m == 0 && n == 1) {
            r = 2;
        } else if (m >= 0 && n == 0) {
            r = 1;
        } else if (m == 0 && n >= 2) {
            r = n + 2;
        } else if (m >= 1 && n >= 1) {
            r = ackerman(ackerman(n - 1, m), m - 1);
        }

        return r;
    }
}

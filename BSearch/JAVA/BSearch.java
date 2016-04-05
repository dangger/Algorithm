/*
 * Input:6 1 5 5 9 6 9 6
 * Output:3
 * */

import java.util.Scanner;
import java.util.Arrays;

public class BSearch {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        /*
        System.out.print("x = ");
        */
        int x = sc.nextInt();

        /*
        System.out.print("num[] = " + num[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + num[i]);
        }
        System.out.println();
        */
 
        Arrays.sort(num, 0, n);

        /*
        System.out.print("num[] = " + num[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + num[i]);
        }
        System.out.println();
        */

        /*
        System.out.println("num[" + BSearch(num, x, 0, n - 1)
                + "] is " + x);
        System.out.println("num[" + BSearch(num, x, n)
                + "] is " + x);
        */

        //递归调用
        System.out.println(BSearch(num, x, 0, n - 1));
        //非递归调用
        //System.out.println(BSearch(num, x, n));
    }

    //递归实现
    public static int BSearch (int[] num, int x, int low , int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (x == num[mid]) {
            return mid;
        } else if (x < num[mid]) {
            return BSearch(num, x, low, mid - 1);
        } else {
            return BSearch(num, x, mid + 1, high);
        }
    }

    //非递归实现
    public static int BSearch (int[] num, int x, int n) {
        int mid;
        int low = 0, high = n - 1;

        while (high >= low) {
            mid = (low + high) / 2;
            if (x == num[mid]) {
                return mid;
            } else if (x < num[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}

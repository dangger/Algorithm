/*
 * Input:8 11 1 2 4 8 6 15 8
 * Output:1 2 4 6 8 8 11 15
 * */

import java.util.Scanner;

public class MergeSort{

    public static void mergeSort (int[] a, int left, int right) {
        int[] b = new int[100];

        if (left < right) {
            int i = (left + right) / 2;
            mergeSort(a, left, i);
            mergeSort(a, i + 1, right);
            merge(a, b, left, i, right);
            copy(a, b, left, right);
        }
    }

    public static void merge (int[] c, int[] d, int l, int m, int r) {
        int i = l, j = m + 1, k = l;

        while ((i <= m) && (j <= r)) {
            if (c[i] <= c[j]) {
                d[k++] = c[i++];
            } else {
                d[k++] = c[j++];
            }
        }

        if (i > m) {
            for (int q = j; q <= r; q++) {
                d[k++] = c[q];
            }
        } else {
            for (int q = i; q <= m; q++) {
                d[k++] = c[q];
            }
        }
    }

    public static void copy (int[] a, int[] b, int m, int n) {
        for (int i = m; i <= n; i++) {
            a[i] = b[i];
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        mergeSort(a, 0, n - 1);

        System.out.print(a[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}

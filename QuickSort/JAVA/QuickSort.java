/*
 * Input:8 9 1 2 4 8 6 15 8
 * Output:1 2 4 6 8 8 9 15
 * */

import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] num, int left, int right) {
        if (left < right) {
            int x = Partition(num, left, right);
            quickSort(num, left, x - 1);
            quickSort(num, x + 1, right);
        }
    }

    public static int Partition(int[] num, int left, int right) {
        int i = left, j = right + 1;
        int x = num[left];

        while (true) {
            while (num[++i] < x && i < right) ;
            while (num[--j] > x) ;
            if (i >= j) break;
            swap(num, i, j);
        }

        num[left] = num[j];
        num[j] = x;
        return j;
    }

    public static void swap(int[] num, int a, int b) {
        int t = num[a];
        num[a] = num[b];
        num[b] = t;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        quickSort(num, 0, n - 1);

        System.out.print(num[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + num[i]);
        }
        System.out.println();
    }
}

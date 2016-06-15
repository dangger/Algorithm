/*
 * Input:6 1 5 5 9 6 9 6
 * Output:3
 * */

import java.util.Scanner;

public class BSearch {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }


        int x = sc.nextInt();

        Sort(num, 0, n);



        //递归调用
        System.out.println(BSearch(num, x, 0, n - 1));

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



    public static void Sort(int[] num, int left, int right) {
        for (int i = left; i < right; i++) {
            for (int j = i + 1; j < right; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}

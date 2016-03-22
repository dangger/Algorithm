public class Perm {

    public static void perm (Object[] list, int k, int m) {
        if (k == m) {
            for (int i = 0; i <= m; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = k; i <= m; i++) {
                swap(list, k, i);
                perm(list, k + 1, m);
                swap(list, k, i);
            }
        }
    }

    public static void swap(Object[] list, int k, int m) {
        Object t;
        t = list[k];
        list[k] = list[m];
        list[m] = t;
    }

    public static void main(String[] args) {
        Object list_a[] = {4};
        Object list_b[] = {'a', 'b', 'c', 'd'};
        perm(list_a, 0, 0);
        perm(list_b, 0, 3);
    }
}

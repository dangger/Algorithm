public class Select {

    private static Comparable randomizedSelect (Comparable []a, 
            int p, int r, int k) {
        if (p == r) return a[p];
        int i = randomizedPartition(a, p, r), j = i - p + 1;
        if (k == j) return a[i];
        if (k < j) return randomizedSelect(a, p, i - 1, k);
        else return randomizedSelect(a, i + 1, r, k - j);
    }
}

#include<iostream>
using namespace std;

void swap(int *a, int *b)
{
    int t;
    t = *a;
    *a = *b;
    *b = t;
}

void perm(int *list, int k, int m)
{
    if (k == m) {
        for (int i = 0; i <= m; i++) {
            cout << *(list + i) << " ";
        }
        cout << endl;
    } else {
        for (int i = k; i <= m; i++) {
            swap(list + k, list + i);
            perm(list, k + 1, m);
            swap(list + k, list + i);
        }
    }
}

int main()
{
    int list[] = {1, 2, 3};

    perm(list, 0, 2);

    return 0;
}

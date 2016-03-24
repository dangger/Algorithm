#include<iostream>
using namespace std;

void swap(char *a, char *b)
{
    int t;
    t = *a;
    *a = *b;
    *b = t;
}

void perm(char *list, int k, int m)
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
    char list_a[] = {'4'};
    char list_b[] = {'a', 'b', 'c', 'd'};

    perm(list_a, 0, 0);
    cout << endl;
    perm(list_b, 0, 3);

    return 0;
}

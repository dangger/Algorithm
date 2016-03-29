#include<iostream>
using namespace std;

template<class ElemType>
int BSearch_a(ElemType* num, ElemType x, int low, int high)
{
    int mid;

    if (low > high) {
        return -1;
    }

    mid = (low + high) / 2;

    if (x == *(num + mid)) {
        return mid;
    } else if (x < *(num + mid)) {
        return BSearch_a(num, x, low, mid - 1);
    } else {
        return BSearch_a(num, x, mid + 1, high);
    }
}

template<class ElemType>
int BSearch_b(ElemType* num, ElemType x, int low, int high)
{
    int mid;

    while (high >= low) {
        mid = (low + high) / 2;

        if (x == *(num + mid)) {
            return mid;
        } else if (x < *(num + mid)) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return -1;
}

int main()
{
    int num[100];
    int x;
    int numSize;

    cin >> numSize;
    for (int i = 0; i < numSize; i++) {
        cin >> num[i];
    }

    cout << "num[] = " << num[0];
    for (int i = 1; i < numSize; i++) {
        cout << ", "<< num[i];
    }
    cout << endl;
    cout << "x = ";

    cin >> x;

    cout << "num[";
    cout << BSearch_a(num, x, 0, numSize);
    cout << "] is " << x << endl;

    cout << "num[";
    cout << BSearch_b(num, x, 0, numSize);
    cout << "] is " << x << endl;

    return 0;
}

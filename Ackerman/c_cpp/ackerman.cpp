#include<iostream>
#include<stack>
using namespace std;

int ackerman(int n, int m)
{
    stack<int> MStack;

    MStack.push(m);

    while (!MStack.empty()) {
        m = MStack.top();
        MStack.pop();

        if (m == 0 && n == 1) {
            n = 2;
        } else if (m >= 0 && n == 0) {
            n = 1;
        } else if (m == 0 && n >= 1) {
            n = n + 2;
        } else if (m >= 1 && n >= 1) {
            n = n - 1;
            MStack.push(m - 1);
            MStack.push(m);
        }
    }

    return n;
}

int main()
{
    cout << "This is a Ackerman function.\n";
    cout << "Please enter n and m:\n";

    int n;
    int m;

    cout << "n = ";
    cin >> n;
    cout << "m = ";
    cin >> m;

    cout << "Ackerman(" << n << "," << m << ") = "
        << ackerman(n, m) << endl;

    return 0;
}

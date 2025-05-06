#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }
    
    vector<int> dp(n, 0);
    // The sequence must have at least 2 elements.
    // Process from the end to the beginning.
    for (int i = n - 2; i >= 0; --i) {
        if (arr[i+1] - arr[i] >= 2) {
            dp[i] = dp[i+1] + 1;
        } else {
            dp[i] = 0;
        }
    }
    
    for (int i = 0; i < n; ++i) {
        // The actual sequence length is dp[i] + 1, but since the sequence must have >=2 elements:
        if (dp[i] >= 1) {
            cout << dp[i] + 1 << '\n';
        } else {
            // Check if the next element is valid to form a sequence of length 2.
            if (i + 1 < n && arr[i+1] - arr[i] >= 2) {
                cout << 2 << '\n';
            } else {
                cout << 0 << '\n';
            }
        }
    }
    
    return 0;
}
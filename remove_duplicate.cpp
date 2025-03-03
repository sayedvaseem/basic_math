#include <iostream>
using namespace std;

int main() {
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    cin>>arr[i];
    int i=0;
    cout << "Modified array: ";
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) { 
                i++;
                arr[i] = arr[j];
            }
        }
	for (int j = 0; j < i+1; j++) {
        cout << arr[j] << " ";
    }
    cout << endl;
    return 0;
}

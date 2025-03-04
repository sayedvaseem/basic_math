#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"enter the size of array";
	cin>>n;
	cout<<"enter the array elements";
	int arr[n];
	for(int i=0;i<n;i++)
	cin>>arr[i];
	int actual_sum = n*(n+1)/2;
	int sum = 0;
	for(int i=0;i<n;i++)
	sum += arr[i];
	cout<<"the missing number is "<<actual_sum - sum;
	return 0;
}

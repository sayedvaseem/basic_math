#include<iostream>
using namespace std;
int main(){
	cout<<"enter the size of array";
	int n;
	cin>>n;
	int arr[n];
	cout<<"enter the elements of array";
	for(int i=0;i<n;i++)
		cin>>arr[i];
	int last_num = arr[0];
	for(int i=0;i<n;i++)
		arr[i] = arr[i+1];
	arr[n-1] = last_num;
	for(int i=0;i<n;i++)
	cout<<arr[i]<<" ";
	return 0;
}

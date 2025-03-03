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
	int k;
	cout<<"enter the number of rotation";
	cin>>k;
	while(k>0){
		for(int i=0;i<n-1;i++){
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		k--;
	}
	for(int i=0;i<n;i++)
	cout<<arr[i]<<" ";
	return 0;
}

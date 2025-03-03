#include<iostream>
using namespace std;
int main(){
	cout<<"enter the size of array";
	int n,k;
	cin>>n;
	int arr[n];
	cout<<"enter the elements of array";
	for(int i=0;i<n;i++)
	cin>>arr[i];
	
	cout<<"enter the number of rotations";
	cin>>k;
	
	while(k>0){
		int last_num = arr[0];
		for(int i=0;i<n-1;i++){
			arr[i] = arr[i+1];
		}
		arr[n-1] = last_num;
		k--;
	}
	for(int i=0;i<n;i++)
	cout<<arr[i]<<" ";
	return 0;
}

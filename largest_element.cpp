#include<iostream>
using namespace std;
int main(){
	int max =0,n;
	cout<<"enter the arr size ";
	cin>>n;
	int arr[n];
	cout<<"enter the elements in the array";
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	for(int i=0;i<n;i++){
		if(arr[i]>max){
			max = arr[i];
		}
	}
	cout<<"the largest number in the array is :"<<max;
	return 0;
}

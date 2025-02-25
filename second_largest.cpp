#include<iostream>
using namespace std;
int main(){
	int n,sec , max=0;
	cout<<"enter the array size ";
	cin>>n;
	int arr[n];
	cout<<"enter the elements of array";
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	for(int i=0;i<n;i++){
		if(arr[i]>max){
			max = arr[i];
		}
	}
	sec = 0;
	for(int i=0;i<n;i++){
		if(arr[i]>sec && arr[i]<max){
			sec = arr[i];
		}
	}
	cout<<"the second largest element is :"<<sec;
	return 0;
}

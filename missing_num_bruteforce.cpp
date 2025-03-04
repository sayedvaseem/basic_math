#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"enter the size of array ";
	cin>>n;
	int arr[n];
	cout<<"enter the elements of array";
	for(int i=0;i<n;i++)
	cin>>arr[i];
	int flag;
	for(int i=0;i<n;i++){
		flag = 0;
		for(int j=0;j<n;j++){
			if(arr[j] == i){
				flag = 1;
			}	
		}
		if(flag == 0){	
		cout<<"missing num is "<<i;
		break;
		}
	}
	return 0;
}

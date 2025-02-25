#include<iostream>
using namespace std;
int main(){
	int n=5;
	int arr[n] = {1,2,5,5,5};
	for(int i=0;i<n-1;i++){
		if(arr[i] <= arr[i+1]){
			continue;
		}
		else{
				cout<<"not sorted";
				return 0;
		}	
	}
	cout<<"sorted";
	return 0;
}

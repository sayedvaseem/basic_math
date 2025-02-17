#include<iostream>
#include<vector>
using namespace std;
int main(){
	int num;
	cin>>num;
	vector <int> arr;
	for(int i=1;i<=num;i++){
		if(num%i == 0){
			arr.push_back(i);
		}
	}
	for(int i=0;i<arr.size();i++)
	cout<<arr[i]<<" ";
	return 0;
}

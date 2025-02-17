#include<iostream>
using namespace std;
int main(){
	int n1, n2;
	cin>> n1;
	cin>> n2;
	int min;
	if(n1>n2){
	min = n2;
	}
	else{
	min = n1;
	}
	for(int i = min; i>0 ; i--){
		if(n1 % i == 0 && n2 % i == 0){
			cout<<i;
			return 0;
		}
	}
	cout<<1;
	return 0;
}

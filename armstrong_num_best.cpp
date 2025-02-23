#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n,rem,sum = 0;
	cin>>n;
	int actual = n;
	while(n > 0){
		rem = n % 10;
		sum += pow(rem,3);
		n = n/10;
	}
	if(sum == actual){
		cout<<"true";
	}
	else{
		cout<<"false";
	}
	return 0;
}

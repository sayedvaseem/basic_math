#include<iostream>
using namespace std;
int main(){
	int n,re,rev = 0;
	cin>>n;
	int a = n;
	while(n> 0){
		re = n%10;
		rev = rev*10 + re;
		n = n/10;
	}
	if (rev ==a){
		cout<<"true"; 
	}
	else{
		cout<<"false";
	}
	return 0;
}

#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n,count = 0;
	cin>>n;
	int root = sqrt(n);
	for(int i=1;i<=root;i++){
		if(n%i == 0){
			count++;
			if(i != n/i){
				count++;
			}
		}
	}
	count == 2?cout<<"true":cout<<"false";
	return 0;	
	
}

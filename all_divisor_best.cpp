#include<iostream>
#include<cmath>
#include<vector>
using namespace std;
int main(){
	int n;
	cin>>n;
	vector <int> v;
	int root = sqrt(n);
	for(int i=1;i<=root;i++){
		if(n%i == 0){
		v.push_back(i);	
		if(i != n/i){
			v.push_back(n/i);
		}
		}
	}
	for(int i=0;i<v.size();i++){
		cout<<v[i]<<" ";
	}
	return 0;
}

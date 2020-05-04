#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n,m,req;
    cin>>n>>m>>req;
    int res1=pow(n,m);
    if(req<=res1)
    {
        cout<<"Doctor, you can proceed with your experiment.";
    }
    else
    {
        cout<<"Sorry Doctor! You need more bacteria.";    
    }
    
	return 0;
}
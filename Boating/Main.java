#include<iostream>
using namespace std;
int main()
{
  int wt,a,c;
  cin>>wt>>a>>c;
  int sum=0;
  int suma=75*a;
  int sumc=30*c;
  sum=suma+sumc;
  if(sum<wt)
  {
	cout<<"Boat is stable";
  }
  else
  {
  	 cout<<"Boat will drow";
  }
}
  

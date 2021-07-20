#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int Printer(int _priorities[],int _narray,int _location);

int main()
{

	int priorities[4]={2,1,3,2};
	int location=2;

	cout << "" << Printer(priorities,sizeof(priorities)/sizeof(int),location) << endl;
	return 0;
}//main()

int Printer(int _priorities[],int _narray,int _location)
{
	int order=0;
	int max = 0;
	int nlarger = 0;
	int nsame = 0;
	int init_narray=_narray;

	//vector<int> priorities;
	queue<int> priorities;

#if 1//_Debug_
	for(int i=0;i<_narray;i++)
	{
		//for test vector conversion
		//priorities[i]=_priorities[i];

		priorities.push<_priorities[i]>;
	}//i
	_location = (_location+(_narray-nlager_or_same))%_narray;
	init_narra -= nbigger;
	
	for(int ii=0;ii<init_narray;ii++)
	{
		if(priorities.front()>_priorities[_location])
		{
			nlager++;
			priorities.pop();
		}
		else 
		{
			priorities.push<priorities.front()>
			priorities.pop();
		}

	}//ii
	for(int j=0;j<init_narray;j++)
	{

	}
	//_location+넘기는 횟수를 Divide by length of array!!
#endif //_Debug_
	
	return order;

}//Printer()

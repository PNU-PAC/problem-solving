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

	int priorities2[6]={1,1,9,1,1,1};
	int location2=0;

	cout << "" << Printer(priorities2,sizeof(priorities2)/sizeof(int),location2) << endl;

	return 0;
}//main()

int Printer(int _priorities[],const int _init_array_len,const int _location)
{
	int order=1;
	int nelement=_init_array_len;
	int location=_location;
	queue<int> priorities;

	//vector<int> priorities;

	//cout << "Initial array length : " << nelement << endl;
	for(int i=0;i<nelement;i++)
	{
		//for test vector conversion
		//priorities[i]=_priorities[i];

		priorities.push(_priorities[i]);
	}//i

	for(int ii=0;ii<nelement;ii++)
	{
		//cout << "The Print that we want to know the order : "  << _priorities[_location] << endl;
		if(priorities.front()>_priorities[_location])
		{
			priorities.pop();
			location -= location;
			order++;
		}else
		{
			priorities.push(priorities.front());
			priorities.pop();
			location = (location+(nelement-1))%nelement;
		}
	}//ii
	//cout << "order before check number of same priorities tasks : " << order << endl;
	//cout << "location before check number of same priorities tasks : " << location << endl;
	for(int j=0;j<nelement-order+1;j++)
	{
		if(priorities.front()==_priorities[_location])
		{
			if(location == 0) return order;
			else 
			{
				priorities.pop();
				location -= 1;
				//cout << "Changing location : "<< location << endl;
				order++;
				//cout << "Changing of order : " << order << endl;
			}
		}else
		{
			priorities.push(priorities.front());
			priorities.pop();
			location -= 1;
		}
	}//j

	return order;
}//Printer()

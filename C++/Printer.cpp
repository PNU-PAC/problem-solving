#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int Printer(vector<int> _priorities,int _location);

int main()
{

	vector<int> priorities={2,1,3,2};
	int location=2;

	cout << "" << Printer(priorities,location) << endl;

	vector<int> priorities2={1,1,9,1,1,1};
	int location2=0;

	cout << "" << Printer(priorities2,location2) << endl;

}//main()

int Printer(vector<int> _priorities, const int _location)
{
	int order=1,
			//nelement=_priorities.size(),
			location=_location;
	queue<int> priorities;

	for(int i=0;i<_priorities.size();i++)
		priorities.push(_priorities[i]);

	for(int ii=0;ii<_priorities.size();ii++)
	{
		if(priorities.front()>_priorities[_location])
		{
			priorities.pop();
			location--;
			order++;
		}else
		{
			priorities.push(priorities.front());
			priorities.pop();
			location = (location+(_priorities.size()-1))%_priorities.size();
		}
	}//ii loop

	for(int j=0;j<_priorities.size()-order+1;j++)
	{
		if(priorities.front()==_priorities[_location])
		{
			if(location == 0) return order;
			else 
			{
				priorities.pop();
				location--;
				order++;
			}
		}else
		{
			priorities.push(priorities.front());
			priorities.pop();
			location--;
		}
	}//j loop

	return order;

}//Printer()

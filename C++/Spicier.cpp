#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int Spicier(vector<int> scoville, int K);

int main()
{
	vector<int> scoville = {1,2,3};
	int K=11;

	cout << "" << Spicier(scoville,K) << endl;

}//main()

int Spicier(vector<int> scoville, int cut)
{
	int nmixing = 0;

	priority_queue<int, vector<int>, greater<int>> _scoville;
	for(int i=0;i < scoville.size();i++)
	{
		_scoville.push(scoville[i]);
	}//i loop

	for(int j=0;j<scoville.size()-1;j++)
	{
		if(_scoville.top() >= cut) break;

		int min[3];

		for(int jj=0;jj<3;jj++)
		{
			if(!_scoville.empty())
			{
				min[jj]=_scoville.top();
				_scoville.pop();
			}
		}//jj loop

		if(min[1] < min[2] )
		{ 
			int sum = min[0] + min[1]*2;
			_scoville.push(min[2]);
			_scoville.push(sum);
		}else
		{
			int sum = min[0] + min[2]*2;
			_scoville.push(min[1]);
			_scoville.push(sum);
		}

		nmixing++;

	}//j loop

	if(_scoville.top() < cut) nmixing = -1;
	
	return nmixing;

}//Spicier()

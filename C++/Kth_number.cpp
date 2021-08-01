#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> Kth_number(vector<int> _array,vector<vector<int>> _commands);

int main()
{
#if 1//_debug_
	vector<vector<int>> commands = {{2,5,3},{4,4,1},{1,7,3}};
	vector<int> array = {1,5,2,6,3,7,4};

	Kth_number(array,commands);
	return 0;
#endif //_debug_
}//main()

vector<int> Kth_number(vector<int> _array,vector<vector<int>> _commands)
{
	int _i,_j,_k;
	vector<int> array;
	vector<int> icommand;
	//vector<int> separated_array;
	vector<int> answer;

#if 1//_debug_
	int i=0;
	for(auto iter:_commands)
	{
		array = _array;
		icommand = _commands[i];
		/*
		for(int j=0;j<3;j++)
		{
			cout << icommand[j] << endl;
			_i = icommand[]
		}//j loop
		*/

		_i = icommand[0]; _j = icommand[1]; _k = icommand[2];
		//_i = 0;_j = 6;_k = icommand[2];
		sort(&array[_i-1],&array[_j],less<int>());
		answer.push_back(array[_k+_i-2]);
		//Following the result of the test, &_array[_j] is "start" point of memory of _j_th component of the vector. To sort _j_th component, you should "not" subtract one at _j because they sort "between" those memory address.
		for(int i=0;i<array.size();i++)
		{
			cout << array[i];
		}//i loop
		cout << endl;
		i++;
	}//iter loop
#endif //_debug_

	/*
	//cout << "i : " << _i  << "	" << "j : " << _j << endl;
	for(int i=0;i<_array.size();i++)
	{
		cout << _array[i];
	}//i loop
	*/
	for(int r=0;r<3;r++)
	{
		cout << answer[r] << endl;
	}//r loop

	return answer;
}//Sorting()

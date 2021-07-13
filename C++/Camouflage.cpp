#include <unordered_map>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

int Camouflage(string clothes[30][2])
{
	unordered_map<string, int> co;
	int comb=1;

#if 1//_Debug_
	for(int i=0;i<30;i++)
	{
		for(int j=0;j<2;j++)
		{
			//if(!clothes[i][j]) continue;
			co[clothes[i][j]] = co[clothes[i][j]] + 1;
		}//j
	}//i
#endif //_Debug_

	for(auto const& element:co)
	{
		if(element.second != 0)
			comb *= element.second+1;
	}//element:co

	return comb;

	//number of clotheses of each species +1(for wear no this species of clothes) and times each others and -1(for wear nothing case)
}

int main()
{
	string clothes[3][2]={{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
	cout << "Answer is : " << Camouflage(clothes) << endl;
	
}

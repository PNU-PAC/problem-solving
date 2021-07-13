#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

int main()
{
  string name;

  unordered_map<string, int> participant;
  unordered_map<string, int> completion;

  /*
  for()
  {
	participant[name]=participant[name]+1;
  }//loop
  */

  name="katlyn";
  participant[name]=participant[name]+1;

  cout << participant.find(name) << endl;

}//main()

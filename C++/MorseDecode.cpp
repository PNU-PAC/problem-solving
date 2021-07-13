#include <iostream>
#include <cstring>
#include <string>
#include <vector>

using namespace std;

void MorseDecode(string _morse_code);
vector<string> Split(string s, string divid);

int main()
{
  string _morse_code= ".... . -.--   .--- ..- -.. .";
  MorseDecode(_morse_code);

}//main()

vector<string> Split(string s, string divid) 
{
	vector<string> v;
	char* c = strtok((char*)s.c_str(), divid.c_str());
	while (c) 
	{
		v.push_back(c);
		c = strtok(NULL, divid.c_str());
	}
	return v;
}//Split()

void MorseDecode(string _morse_code)
{
  vector<string> _unit_morse = Split(_morse_code," ");
  
  for(int i=0;i<(int)_unit_morse.size();i++)
  {
	if(_unit_morse[i]==".-")
	  cout << "A" ;
	else if(_unit_morse[i]=="-...")
	  cout << "B" ;
	else if(_unit_morse[i]=="-.-.")
	  cout << "C" ;
	else if(_unit_morse[i]=="-..")
	  cout << "D" ;
	else if(_unit_morse[i]==".")
	  cout << "E" ;
	else if(_unit_morse[i]=="..-.")
	  cout << "F" ;
	else if(_unit_morse[i]=="--.")
	  cout << "G" ;
	else if(_unit_morse[i]=="....")
	  cout << "H" ;
	else if(_unit_morse[i]=="..")
	  cout << "I" ;
	else if(_unit_morse[i]==".---")
	  cout << "J" ;
	else if(_unit_morse[i]=="-.-")
	  cout << "K" ;
	else if(_unit_morse[i]==".-..")
	  cout << "L" ;
	else if(_unit_morse[i]=="--")
	  cout << "M" ;
	else if(_unit_morse[i]=="-.")
	  cout << "N" ;
	else if(_unit_morse[i]=="---")
	  cout << "O" ;
	else if(_unit_morse[i]==".--.")
	  cout << "P" ;
	else if(_unit_morse[i]=="--.-")
	  cout << "Q" ;
	else if(_unit_morse[i]==".-.")
	  cout << "R" ;
	else if(_unit_morse[i]=="...")
	  cout << "S" ;
	else if(_unit_morse[i]=="-")
	  cout << "T" ;
	else if(_unit_morse[i]=="..-")
	  cout << "U" ;
	else if(_unit_morse[i]=="...-")
	  cout << "V" ;
	else if(_unit_morse[i]==".--")
	  cout << "W" ;
	else if(_unit_morse[i]=="-..-")
	  cout << "X" ;
	else if(_unit_morse[i]=="-.--")
	  cout << "Y" ;
	else if(_unit_morse[i]=="--..")
	  cout << "Z" ;
	else if(_unit_morse[i]=="-----")
	  cout << "0" ;
	else if(_unit_morse[i]==".----")
	  cout << "1" ;
	else if(_unit_morse[i]=="..---")
	  cout << "2" ;
	else if(_unit_morse[i]=="...--")
	  cout << "3" ;
	else if(_unit_morse[i]=="....-")
	  cout << "4" ;
	else if(_unit_morse[i]==".....")
	  cout << "5" ;
	else if(_unit_morse[i]=="-....")
	  cout << "6" ;
	else if(_unit_morse[i]=="--...")
	  cout << "7" ;
	else if(_unit_morse[i]=="---..")
	  cout << "8" ;
	else if(_unit_morse[i]=="----.")
	  cout << "9" ;
	else cout << "Occured Error." << endl;
  }
  cout << endl;
}//decodeMorse()

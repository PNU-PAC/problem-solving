# 완전 탐색(Exhaustive Search)  
## 가능한 모든 경우의 수를 탐색하는 알고리즘  
### 완전 탐색을 하는 방법
#### Brute Force 기법  
반복문, 조건문을 통해 가능한 모든 경우의 수를 모두 찾는 기법  
 - 자물쇠 번호 0000 - 9999 모두 눌러보기  
#### 순열(Permutation)  
주어진 배열을 순서를 고려해서 나열하는 기법
 - 1,2,3,4를 이용하여 만들 수 있는 수 중 소수 찾기  
 - O(n!)의 시간 복잡도를 가짐  
python, C++ 같은 경우는 배열의 다음 순열을 찾는 함수가 기본 라이브러리에 존재한다.
##### python
```python
from itertools import permutations
...
s = []
for p in permutations(range(3)) :
  s.add(s)
print(s)
# permutations(range(3)) --> 012 021 102 120 201 210

# permutations('ABCD', 2) --> AB AC AD BA BC BD CA CB CD DA DB DC
```
##### C++  
```C++
#include <algorithm>
#include <vector>
#include <iostream>
namespace std;
...
vector<int> v;

do{

		for(int i=0; i<v.size(); i++){
			cout << v[i] << " ";
		}

		cout << '\n';

	}while(next_permutation(v.begin(),v.end()));
```
#### 재귀 호출

#### 비트마스크

#### BFS, DFS


### 출처 및 둘러보기  
https://rebro.kr/59  
https://hongjw1938.tistory.com/78  

#### java  

#### python  
https://potensj.tistory.com/110  
https://docs.python.org/3/library/itertools.html#itertools.permutations  

#### C++  
https://twpower.github.io/82-next_permutation-and-prev_permutation  

# 완전 탐색(Exhaustive Search)  
## 가능한 모든 경우의 수를 탐색하는 알고리즘  
### 완전 탐색을 하는 방법
#### Brute Force 기법  
반복문, 조건문을 통해 가능한 모든 경우의 수를 모두 찾는 기법  
 - 자물쇠 번호 0000 - 9999 모두 눌러보기  
#### 순열(Permutation)  
주어진 배열을 순서를 고려해서 나열하는 기법
 - 1,2,3,4를 이용하여 만들 수 있는 수 중 소수 찾기  

O(n!)의 시간 복잡도를 가짐  
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
함수 내에서 또 다시 자신을 불러오는 함수
 - n개의 숫자 중 m개의 숫자를 선택하는 경우 - for문의 수가 입력에 따라 달라짐  

나 자신을 불러오기 때문에, 연산을 종료하기 위해 현재 단계의 상태를 매개변수로 받아와야하며, 종료 조건을 잘 만들어야한다.  
DP, 병합 정렬 등 다른 기법에서도 재귀 호출을 쓰지만, 이 경우에는 재귀 호출을 통해 실질적인 연산 횟수가 줄어든다.  
#### 비트마스크
부분 집합을 비트로 표현하는 기법  
 - 가령 [1,2,3] 이라는 리스트가 있을 때, 이 리스트의 모든 부분집합을 비트로 나타내면 다음과 같다.  
0 - 0 0 0 - []  
1 - 0 0 1 - [3]  
2 - 0 1 0 - [2]  
3 - 0 1 1 - [2,3]  
4 - 1 0 0 - [1]  
5 - 1 0 1 - [1,3]  
6 - 1 1 0 - [1,2]  
7 - 1 1 1 - [1,2,3]  

이를 리스트와 같은 크기의 boolean 리스트로 표현할수도 있고, __정수 자료형__ 으로 표현할 수도 있다.  
#### BFS, DFS
Breadth First Search, Depth First Search  
그래프에서 모든 정점을 탐색하기 위한 방법이다.  

### 출처 및 둘러보기  
https://rebro.kr/59  
https://hongjw1938.tistory.com/78  

#### java  

#### python  
https://potensj.tistory.com/110  
https://docs.python.org/3/library/itertools.html#itertools.permutations  

#### C++  
https://twpower.github.io/82-next_permutation-and-prev_permutation  

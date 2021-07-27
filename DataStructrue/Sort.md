# 정렬(Sort)  
## 데이터들을 일정한 기준으로 정리하여 열거하는 것  
### Big-O 표기법이란?
함수의 증가 양상을 나타내는 점근 표기법의 하나로, n의 입력을 받은 함수가 평균 g(n)의 속도로 증가한다는 것을 O(g(n))으로 표기한다.  
이는 컴퓨터공학에서는 어떠한 프로그램의 수행에 걸리는 시간을 나타내는 방법으로 쓰이며, 이를 시간복잡도라고한다.  
가령, 어떤 메소드에 입력으로써 크기가 n인 배열이 들어 갔을 때, 이 메소드를 수행하는 데에 걸리는 시간이 n^2만큼 이라고 한다면 O(n^2)와 같이 표기한다.  

### 정렬의 종류
#### 버블 정렬
big-O : O(n^2)  
1번째와 2번째 원소를 비교하여 정렬하고, 2번째와 3번째, ..., n-1번째와 n번째를 정렬한 뒤 다시 처음으로 돌아가 이번에는 n-2번째와 n-1번째까지, ...해서 최대 n(n-1)/2번 정렬한다.  
#### 선택 정렬
big-O : O(n^2)  
1번째부터 끝까지 훑어서 가장 작은 게 1번째, 2번째부터 끝까지 훑어서 가장 작은 게 2번째...해서 (n-1)번 반복한다.  
#### 삽입 정렬
big-O : O(n^2)  
n번째 원소를 1번째부터 n-1번째까지와 비교해 적절한 위치에 끼워넣고 그 뒤의 자료를 한 칸씩 뒤로 밀어내는 방식  
그밖에도 배열이 작을 경우에 역시 상당히 효율적이다. 일반적으로 빠르다고 알려진 알고리즘들도 배열이 작을 경우에는 대부분 삽입 정렬에 밀린다. 따라서 고성능 알고리즘들 중에서는 배열의 사이즈가 클때는 O(nlogn) 알고리즘을 쓰다가 정렬해야 할 부분이 작을때 는 삽입 정렬로 전환하는 것들도 있다.
#### 병합 정렬
big-O : O(nlog n)  
원소 개수가 1 또는 0이 될 때까지 두 부분으로 쪼개고 쪼개서 자른 순서의 역순으로 크기를 비교해 병합해 나간다. 병합된 부분 안은 이미 정렬되어 있으므로 전부 비교하지 않아도 제자리를 찾을 수 있다.  
#### 힙 정렬
big-O : O(nlog n)  
원소들을 전부 힙에 넣고 힙이 빌 때까지 루트에서 데이터를 꺼낸다.  
#### 퀵 정렬
big-O : O(nlog n)  
원소 하나를 기준(피벗, pivot)으로 삼아 그보다 작은 것을 앞으로 빼내고 그 뒤에 피벗을 옮겨 피벗보다 작은 것, 큰 것으로 나눈뒤 나누어진 각각에서 다시 피벗을 잡고 정렬해서 각각의 크기가 0이나 1이 될 때까지 정렬한다.  
#### 팀 정렬 (python - sort(), java - Array.sort())
기본적으로 병합정렬을 사용하지만, 파티션의 크기가 특정한 값 이하가 되면 삽입 정렬을 사용한다.  
#### 인트로 정렬 (C++ - std::sort)
기본적으로 퀵 정렬을 사용하지만 재귀 깊이가 깊어지는 경우 힙 정렬을 사용한다. 

### 사용 방법
#### java  
```java
import java.util.Arrays;
import java.util.ArrayList; //Collection을 상속받은 모든 클래스가 가지고 있음.
import java.util.Collections;
...
Arrays.sort(arr);
Arrays.sort(arr,Collections.reverseOrder()); //역순
Collections.sort(list);
Collections.sort(list,Collections.reverseOrder()); //역순
```
#### python  
```python
...
list.sort()
list.sort(reverse = True) #역순
sortedList = sorted(list)
sortedList = sorted(list reverse = True) #역순
```
#### C++  
```C++
include <algorithm>
...
sort(arr,arr+length); //배열 길이만큼 정렬
sort(vector.begin(),vector.end());
sort(vector.begin(),vector.end(),greater<T>()); //역순
```





### 출처 및 둘러보기
위키백과 - 정렬알고리즘: https://ko.wikipedia.org/wiki/%EC%A0%95%EB%A0%AC_%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98  
나무위키 - 정렬알고리즘: https://namu.wiki/w/%EC%A0%95%EB%A0%AC%20%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98#s-2.3  

#### java
https://coding-factory.tistory.com/549  
https://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort  

#### python
https://wikidocs.net/16041  

#### C++
https://blockdmask.tistory.com/178  

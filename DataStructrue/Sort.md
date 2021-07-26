# 정렬(Sort)  
## 데이터들을 일정한 기준으로 정리하여 열거하는 것  
### Big-O 표기법이란?
함수의 증가 양상을 나타내는 점근 표기법의 하나로, n의 입력을 받은 함수가 평균 g(n)의 속도로 증가한다는 것을 O(g(n))으로 표기한다.  
이는 컴퓨터공학에서는 어떠한 프로그램의 수행에 걸리는 시간을 나타내는 방법으로 쓰이며, 이를 시간복잡도라고한다.  
가령, 어떤 메소드에 입력으로써 크기가 n인 배열이 들어 갔을 때, 이 메소드를 수행하는 데에 걸리는 시간이 n^2만큼 이라고 한다면 O(n^2)와 같이 표기한다.  
### 정렬의 종류
#### 버블 정렬

#### 선택 정렬

#### 삽입 정렬

#### 병합 정렬

#### 힙 정렬

#### 퀵 정렬

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

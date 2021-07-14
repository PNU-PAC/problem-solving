# 힙(Heap)
## 완전이진트리를 기본으로 한, 일정한 규칙을 가지는 자료구조
### 트리, 완전이진트리란?
<img src = "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F9975E4375BDD3BFF3A" alt = "Tree image from tistory" height = "300" width = "400" />  
트리란, 회로(자기 자신으로 갈 수 있는 길)이 없고, 두 다른 노드(원소)를 잇는 방법이 하나 뿐인 그래프이다. 트리에서 가장 위에 위치한 노드를 루트노드라고 하며, 어떠한 노드의 위에 있는 노드를 부모 노드, 아래에 있는 노드를 자식노드, 같은 부모 노드를 가진 노드를 형제노드라고한다. 또한 루트노드로부터 몇 노드나 떨어져있느냐를 나타내는 수치가 레벨이다. 그리고 자식노드가 없는 노드를 리프노드, 혹은 단말노드라고하며 루트노드, 자식노드가 아닌 노드를 내부노드라고한다.  
완전이진트리란, 모든 노드들이 최대 2개의 자식노드를 가지며, 가장 낮은 레벨을 제외한 모든 레벨이 꽉 채워져 있는 트리이다.  

### 힙은 무엇인가.
힙은, 부모노드와 자식노드 간에 일정한 규칙을 가진 완전이진트리이다. 이 규칙에 따라, 부모노드가 더 크면 최대 힙, 부모노드가 더 작으면 최소 힙이라고 불린다. 따라서 힙의 루트노드에는 최대 힙에서는 가장 큰 원소, 최소 힙에서는 가장 작은 원소가 저장되어 있다. 부모-자식 노드 간의 규칙은 있지만, 형제 노드 간의 규칙은 없기 때문에 힙 내부가 규칙 순으로 정렬되어 있다고 기대하기는 어렵다.  

### 힙의 이용 - 우선순위 큐
<img src = "https://upload.wikimedia.org/wikipedia/commons/3/38/Max-Heap.svg" alt = "Tree image from tistory" height = "500" width = "400" />  
그래서 이러한 힙을 이용한 자료구조가 바로 우선순위 큐(Priority Queue)이다. 우선순위 큐는 내부에 힙을 가지고 있어서, 데이터가 큐에 들어오면 힙에 저장한다. 힙은 들어온 데이터를 힙의 규칙에 따라 정렬 하고, 따라서 들어온 데이터 중에 가장 큰/작은 데이터가 루트 노드에 오게 된다. 그리고 이 루트 노드를 큐의 front로 이용하기 때문에 삭제, 검사를 할 때 큐에서 가장 큰/작은 데이터를 다루게 된다.

마지막으로, 우선순위 큐는 힙을 이용하기 때문에 힙에서 설명했던 것처럼 내부 데이터가 정렬되어있을 것이라고 기대하기 어렵다. 따라서 모든 원소를 출력할 때 iterator를 사용하거나, list를 출력할 때 처럼 인덱스/향상된 for문 으로 출력하게 되면 정렬되어있는 값을 얻을 수 없다. 때문에 정렬되어있는 값을 얻기 위해서는 큐 내부가 빌 때까지 삭제를 하는 것이 가장 좋다.

#### 메소드
큐와 같다.

### 사용법
java  
```java
import java.util.PriorityQueue;
import java.util.Collections;
...
//최소 힙
PriorityQueue<E> pqMin = new PriorityQueue<>();
//최대 힙
PriorityQueue<E> pqMax = new PriorityQueue<>(Collections.reveseOrder());
```
python  
```python
from queue import PriorityQueue
...
#최소 힙
pqMin = PriorityQueue()
#최대 힙 - 파이썬은 최대힙을 만들 수 있는 간단한 방법을 제공하지 않기 때문에 PriorityQueue를 상속받는 클래스를 새로 만들거나, 큐에 넣는 값에 -1을 곱해서 처리해야한다.(출처 링크 참조)
pqMax = PriorityQueue()
#파이썬의 우선순위 큐는 해시처럼 (key, value) 값으로 저장이 가능하며, 이때는 key 값을 기준으로 정렬된다.(출처 링크 참조)
```
C++
```C++
#include <queue>
...
//최소 힙
priority_queue<E,vector<E>,greater<E>> pqMin;
//최대 힙
priority_queue<E> pqMax
```




출처 및 둘러보기
--
https://ko.wikipedia.org/wiki/%ED%8A%B8%EB%A6%AC_%EA%B5%AC%EC%A1%B0  
https://ko.wikipedia.org/wiki/%ED%9E%99_(%EC%9E%90%EB%A3%8C_%EA%B5%AC%EC%A1%B0)  
https://galid1.tistory.com/174  

#### java

#### python
https://www.daleseo.com/python-priority-queue/  
https://stackoverflow.com/questions/41218860/how-to-use-queue-priorityqueue-as-maxheap-python  

#### C++
https://twpower.github.io/93-how-to-use-priority_queue-in-cpp  





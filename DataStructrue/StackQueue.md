# 스택(Stack)/큐(Queue)란?
## 후입선출(Last In First Out), 선입선출(First In First Out)의 자료구조
스택은 후입선출의 구조를 띄고 있으며,상자에 물건을 넣었다가 뺄 때처럼 나중에 들어간 원소가 먼저 나오는 구조를 가지고 있다.  
큐는 선입선출의 구조를 띄고 있으며, 터널에 차가 들어갔다가 나오는 것처럼 먼저 들어간 원소가 먼저 나오는 구조를 가지고 있다.  
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Data_stack.svg/1280px-Data_stack.svg.png" alt = "Stack image in wikipedia" height = "300" width = "400" />
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Data_Queue.svg/1920px-Data_Queue.svg.png" alt = "Queue image in wikipedia" height = "300" width = "400" />  
이 둘을 합한것 처럼 양 쪽에서 추가와 삭제가 가능한 자료구조를 데크(deque; double ended queue)라고 한다.  
따라서 deque를 불러온다면 어떤 메소드를 쓰냐에 따라서 스택으로도, 큐로도 쓸 수 있다.  

### 메소드  
#### 스택
<table border="1">
        <th></th>
	    <th>Java</th>
	    <th>Python</th>
        <th>C++</th>
	    <tr>
	        <td>넣기</td>
	        <td>stack.push(E)</td>
            	<td>stack.push(E)</td>
            	<td>stack.push(E)</td>
	    </tr>
	    <tr>
	        <td>빼기</td>
	        <td>stack.pop()</td>
            	<td>stack.pop()</td>
            	<td>stack.pop()</td>
	    </tr>
        <tr>
            <td>검사</td>
            <td>stack.peek()</td>
            <td>stack.top()</td>
            <td>stack.top()</td>
        </tr>
    </table>  
    
#### 큐
<table border="1">
        <th></th>
	    <th>Java</th>
	    <th>Python</th>
        <th>C++</th>
	    <tr>
	        <td>넣기</td>
	        <td>queue.offer(E)</td>
            	<td>queue.put(E)</td>
            	<td>queue.push(E)</td>
	    </tr>
	    <tr>
	        <td>빼기</td>
	        <td>queue.poll()</td>
            	<td>queue.get()</td>
            	<td>queue.pop()</td>
	    </tr>
        <tr>
            <td>검사</td>
            <td>queue.peek()</td>
            <td>queue.queue[0]</td>
            <td>queue.front()</td>
        </tr>
    </table>
  
C++의 stack.pop()이나 queue.pop()은 void 타입이기 때문에 삭제된 요소를 얻고 싶다면 삭제하기 전에 stack.top(), queue.front()로 미리 값을 얻거나, deque를 이용해야한다.

### 사용법
java  
```java
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
...
Stack<E> s = new Stack<>();
Queue<E> q = new LinkedList<>();
```
python  
```python
import queue

#deque를 이용한 방법
from collection import deque
...
s = []
q = queue.Queue()
q2 = deque()
#데크를 큐로만 쓰고 싶을 때는 삽입:q2.append() 삭제:q2.popleft() 검사:?
```
C++
```C++
#include <stack>
#include <queue>
//deque 이용하기
#include <deque>
...
stack<E> s;
queue<E> q;

deque<E> s2;
deque<E> q2;
//deque는 q2.pop_front() 처럼 메소드 이름과 스택/큐로 쓸 때 각각 써야하는 메소드가 다르므로 주의!
```


출처 및 둘러보기
--  
영어가 된다면 되도록이면 영어로, 안되면 한글로라도 구글에 검색하세요!  
  
https://ko.wikipedia.org/wiki/%EC%8A%A4%ED%83%9D  
https://en.wikipedia.org/wiki/Queue_(abstract_data_type)  
#### java  
https://www.tutorialspoint.com/java/util/java_util_stack.htm  
https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html  

#### python  
deque : https://docs.python.org/ko/3/library/collections.html#collections.deque  
https://www.geeksforgeeks.org/stack-in-python/  
https://docs.python.org/ko/3/library/collections.html  
https://stackoverflow.com/questions/53234946/how-to-print-the-element-at-front-of-a-queue-python-3  

#### C++  
https://twpower.github.io/75-how-to-use-stack-in-cpp  
https://twpower.github.io/76-how-to-use-queue-in-cpp  
https://www.geeksforgeeks.org/stack-in-cpp-stl/  
https://stackoverflow.com/questions/16264017/how-to-access-and-modify-an-element-inside-stdqueue-in-c/16264331  


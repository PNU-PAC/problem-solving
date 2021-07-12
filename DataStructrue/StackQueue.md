# 스택(Stack)/큐(Queue)란?
## 후입선출(Last In First Out), 선입선출(First In First Out)의 자료구조
스택은 후입선출의 구조를 띄고 있으며, 말그대로 상자에 물건을 넣었다가 뺄 때처럼 나중에 들어간 원소가 먼저 나오는 구조를 가지고 있다.  
큐는 선입선출의 구조를 띄고 있으며, 터널에 차가 들어갔다가 나오는 것처럼 먼저 들어간 원소가 먼저 나오는 구조를 가지고 있다.  
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Data_stack.svg/1280px-Data_stack.svg.png" alt = "Stack image in wikipedia" height = "300" width = "400" />
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Data_Queue.svg/1920px-Data_Queue.svg.png" alt = "Queue image in wikipedia" height = "300" width = "400" />  
또한, 이러한 둘의 특성을 합한 것과 같은 자료구조로, 데크(deque)가 있다. 데크는 양쪽 모두에서 원소를 더하거나 뺄 수 있다.
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
            	<td>queue.appendleft(E)</td>
            	<td>queue.push(E)</td>
	    </tr>
	    <tr>
	        <td>빼기</td>
	        <td>queue.poll()</td>
            	<td>queue.pop()</td>
            	<td>queue.pop()</td>
	    </tr>
        <tr>
            <td>검사</td>
            <td>queue.peek()</td>
            <td>?</td>
            <td>queue.front()</td>
        </tr>
    </table>
  

### 사용법
java  
```java
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
...
Stack<E> stack = new Stack<>();
Queue<E> queue = new LinkedList<>();
```
python  
```python
from collections import deque
...
stack = []
queue = deque()
# 리스트나 데크 모두 스택/큐로 쓸 수 있으나, 리스트를 큐로 쓰는 것은 속도가 느리다고 한다.
```
C++
```C++
#include <stack>
#include <queue>
...
stack<E> s;
queue<E> q;
```


출처 및 둘러보기
--  
https://ko.wikipedia.org/wiki/%EC%8A%A4%ED%83%9D  
https://en.wikipedia.org/wiki/Queue_(abstract_data_type)  
#### java  
https://www.tutorialspoint.com/java/util/java_util_stack.htm  
https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html  

#### python  
deque : https://docs.python.org/ko/3/library/collections.html#collections.deque  
https://www.geeksforgeeks.org/stack-in-python/  
https://docs.python.org/ko/3/library/collections.html  

#### C++  
https://twpower.github.io/75-how-to-use-stack-in-cpp  
https://twpower.github.io/76-how-to-use-queue-in-cpp  
https://www.geeksforgeeks.org/stack-in-cpp-stl/  


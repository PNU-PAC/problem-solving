# 스택(Stack)/큐(Queue)란?
## 후입선출(Last In First Out), 선입선출(First In First Out)의 자료구조
스택은 후입선출의 구조를 띄고 있으며,상자에 물건을 넣었다가 뺄 때처럼 나중에 들어간 원소가 먼저 나오는 구조를 가지고 있다.  
큐는 선입선출의 구조를 띄고 있으며, 터널에 차가 들어갔다가 나오는 것처럼 먼저 들어간 원소가 먼저 나오는 구조를 가지고 있다.  
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Data_stack.svg/1280px-Data_stack.svg.png" alt = "Stack image in wikipedia" height = "300" width = "400" />
<img src = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Data_Queue.svg/1920px-Data_Queue.svg.png" alt = "Queue image in wikipedia" height = "300" width = "400" />  
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
from collection improt queue
...
s = []
q = queue.Queue()
q2 = deque()
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
https://stackoverflow.com/questions/53234946/how-to-print-the-element-at-front-of-a-queue-python-3  

#### C++  
https://twpower.github.io/75-how-to-use-stack-in-cpp  
https://twpower.github.io/76-how-to-use-queue-in-cpp  
https://www.geeksforgeeks.org/stack-in-cpp-stl/  


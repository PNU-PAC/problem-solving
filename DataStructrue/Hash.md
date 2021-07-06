# 해시(Hash)란?
## 키(Key) - 값(Value) 쌍으로 이루어진 자료구조
Java, Kotlin에서는 java.util.HashMap을 import 하여 사용할 수 있으며, Python에서는 Dictionary 자료형으로 기본적으로 주어진다.  
C++에서는 std namespace에서 unordered_map 헤더를 include하여 사용할 수 있다. C++에는 이외에도 몇 가지 라이브러리에서 해시를 구현하고 있다.  
### 해시의 특징
해시, 정확히는 해시 테이블이란, (Key, Value)로 데이터를 저장하는 자료구조 중 하나로 빠르게 데이터를 검색할 수 있는 자료구조이다.  
해시는 내부적으로 배열을 갖고 있으며, 해시함수로 변환된 키와 배열의 값을 1대1로 대응시키고 있다. 따라서 값을 찾는 속도가 O(1)으로 배열과 같이 매우 빠르다.  

#### 대표적인 내부 함수
##### Key에 대한 Value 얻기
- Java    : HashMap.get(Key)
- Python  : Dictionary[Key]
- C++     : unordered_map.find(Key)
##### 데이터 삽입
- Java    : HashMap.put(Key, Value)
- Python  : Dictionary[Key] = Value
- C++     : unordered_map.insert(Key)
##### 크기 구하기
- Java    : HashMap.size()
- Python  : len(Dictionary)
- C++     : unordered_map.size()

이 외에도 공통적으로 모든 키나 모든 값을 얻는 함수, 내부를 비우는 함수, 내부가 비었는지 확인하는 함수 등이 있다.  
특히, Java의 .getOrDefault(key, default)나, Python의 .setDefault(key, defalut)와 같은 함수는  
같은 key에 대응하는 value의 합계나 개수 등을 쉽게 저장할 수 있어서, 문제 푸는 데에 도움이 많이 된다.

java  
```java
for(String element:array){
  hashMap.put(element, hashMap.getOrDefault(element, 1) + 1);
}
```
kotlin  
```kotlin
for(element in array){
  hashMap.put(element, hashMap.getOrDefault(element, 1) + 1)
}
```  
python  
```python
for element in array:
  Dictionary[element] = Dictionary.setDefault(element, 1) + 1
```
c++  
```c++
for (int i : nums) {
    unordered_map[i] = unordered_map[i] + 1;
}
```


기타 해시의 작동이나 내부 구조를 알고 싶다면 아래 링크에서 찾아보기를 바란다.

출처 및 둘러보기
--
###### C++
https://gamdekong.tistory.com/73  
https://stackoverflow.com/questions/60107054/c-equivalent-to-java-map-getordefault  
http://www.cplusplus.com/reference/unordered_map/unordered_map/operator[]/  
      
###### Python
https://wikidocs.net/16  
https://rfriend.tistory.com/334

###### Java
https://coding-factory.tistory.com/556
       

해시 테이블이란? : https://mangkyu.tistory.com/102
                  

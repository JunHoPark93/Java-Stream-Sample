# Java-Stream-Sample
Java의 Stream에 대해 알아보자

## 1. Stream 

컬렉션 프레임워크로 데이터를 가공하는데 복잡한 코드를 작성해야만 했다. 게다가 리스트나 배열은 정렬을 할때 둘다 같은이름의 함수 sort를 쓴다. (각 Collection 클래스에 같은 기능을 하는 메서드 중복 정의)
그래서 Stream은 Collection 요소들을 하나씩 참조하며 람다식을 적용하며 (functional interface) 반복적으로 처리할 수 있도록 해주는 기능이다. 즉 데이터를 다루는데 자주 사용되는 메서드들을 정의해 놓았다.

스트림을 사용하지 않는 예를 보자.

```java
List<String> nameList = Arrays.asList("Nancy", "Bob", "Craig", "David",
                "Evan", "Fray", "George", "Henry", "Ivory", "Jessica", "Kyle",
                "Lawrence", "Mike", "Alice");

int cnt = 0;
for(String name : nameList) {
    if(name.contains("a")) {
        cnt ++;
    }
}

```
리스트를 반복문을 돌려서 if문을 써서 a가 들어간 문자열이 나오면 cnt를 증가시켜주는 예제이다.

스트림을 사용하는 예를 보자.

```java
int cnt = (int) nameList.stream().filter(x -> x.contains("a")).count();
```

이렇게 한줄로 끝내버릴 수 있다. 자세히 들여다 보자.

## 2. Stream 의 특성

- 스트림은 데이터를 변경시키지 않는다.
- 스트림은 일회용이라 한 번 쓰이게되면 재생성 해주어야 한다.
- 스트림은 지연연산이라 최종 연산이 수행되기 전에 중간연산이 미리 실행되지 않는다.
- 효율성을 고려해야 한다. 예를들어 Stream<Integer>보다 IntStream을 쓰는것이 autoboxing, unboxing 으로 인해 비효율적인 부분을 막을 수 있다.

## 3. Stream 의 중간연산

대표적인 것 몇개를 보면 filter, sorted, distinct, map 등이 있다.
```java
Stream<T> filter(Predicate<? super T> predicate)
```
filter는 조건식을 주고 결과를 걸러낸다. 
sorted는 말그래도 정렬을 해준다.
distinct는 중복요소 제거하고 걸러낸다.

map은 stream요소에 저장된 값 중에서 원하는 것들만 뽑거나 형태를 변환 시킬 때 사용한다.

## 4. Stream 의 최종연산

여러 필터를 거친 후 최종연산은 한 번만이 가능하다. 대표적으로 forEach(), 

조건 검사 : allMatch(), anyMatch(), nonMatch(), findFirst(), findAny()

통계 : count(), sum(), average(), min(), max()











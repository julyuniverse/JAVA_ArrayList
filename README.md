# 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용 (ArrayList)

## ArrayList 선언

```java
import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList; // ArrayList 클래스는 제네릭 클래스라는 걸 알 수 있다.
}
```

## 멤버쉽 관리하기

- Member 클래스를 만들고, 아이디와 이름을 멤버 변수로 선언
- Member 클래스로 생성된 인스턴스들을 관리하는 클래스를 컬렉션 프레임워크 클래스들을 활용하여 구현한다.

## ArrayList 활용하기

- 멤버를 순차적으로 관리함
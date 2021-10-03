# Java

## Ch5. 참조타입

### 데이터 타입
- 기본 타입
	- 정수
	- 실수
	- 문자
	- 논리 리터럴

- 참조 타입
	- 배열
	- 열거
	- 클래스
	- 인터페이스

### 메모리 사용 영역

#### 메소드 영역

메소드 영역에는 코드에서 사용되는 classe들을 클래스 로더로 읽어 클래스별로 런타임 상수풀, 필드 데이터, 메소드 데이터, 메소드 코드, 새ㅐㅇ성자 코드 등을 분류해서 저장한다. 메소드 영역은 ___JVM이 시작할 때 생성되고 모든 스레드가 공유하는 영역이다.___

#### 힙 영역

힙 영역은 객체와 배열이 생성되는 영역이다. 힙 영역에 생성된 객체와 배열은 JVM스택 영역의 변수나 다른 객체의 필드에서 참조한다.
참조하는 변수나 필드가 없다면 의미 없는 개체가 되기 때문에 이것을 쓰레기로 취급하고 garbage collector를 실행시켜 쓰레기 객체를 힙 영역에서 자동으로 제거한다.

#### JVM 스택 영역

JVM 스택 영역은 각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당 된다. 자바 프로그램에서 추가적으로 스레드를 생성하지 않았다면 main 스레드만 존재하므로 JVM 스택도 하나이다. 
프레임 내부에는 로컬 변수 스택이 있는데, 기본 타입 변수와 참조 타입 변수가 추가되거나 제거된다. 변수가 이 영역에 생성되는 시점은 초기화가 될때, 즉 최초로 변수에 값이 저장될 떄이다. 변수는 선언된 블록 안에서만 스택에 존재하고 블록을 벗어나면 스택에서 제거된다.

__기본타입 변수는 스택 영역에 직접 값을 가지고 있지만, 참조 타입 변수는 값이 아니라 힙 영역이나 메소드 영역의 객체 주소를 가진다.__
참고로 자바에서는 배열을 객체로 취급한다.

```
        String name1 = "신용권";
        String name2 = "신용권";
        if (name1 == name2) {
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
```
일반적으로 String 변수에 저장한다는 표현을 사용한다. 자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 되어있다. 일반적으로 변수에 문자열을 저장할 경우에는 문자열 리터럴을 사용하지만, new 연산자를 사용해서 직접 String 객체를 생성시킬 수도 있다. new 연산자는 힙영역에 새로운 객체를 만들 때 사용하는 연산자로 객체 생성 연산자라고 한다.

```
	String name1 = new "이현동";
	String name2 = new "이현동";
```

이렇게 작성을하면 서로 다른 String 객체를 참조한다.

### 배열 타입

#### 배열이란?
변수는 한 개의 데이터만 저장할 수 있다. 따라서 저장해야 할 데이터의 수가 많아지면 그만큼 많은 변수가 필요하다.

__배열 선언__
```
타입[] 변수;
타입 변수[];
```
두 가지 방법으로 배열 변수를 선언한다.

```
int[] intArray; int inArray[];
double[] doubleArray; double doubleArray[];
String[] strArray; String stringArray[];
```

### new 연산자로 배열 생성
값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면 new 연산자로 다음과 같이 배열 객체를 생성시킬 수 있다.

```
타입[] 변수 = new 타입[길이];
길이는 배열이 저장할 수 있는 값의 수를 말한다. new 연산자로 배열을 생성할 경우에는 이미 배열 변수가 선언된 후에도 가능하다.
int[] int Array
```

## 열거 타입
데이터 중에는 몇가지로 한정된 값만을 갖는 경우가 흔히 있다. 예를 들어 요일에 대한 데이터는 월~일 열거 타입은 몇 개의 열거 상수 중에서 하나의 상수를 저장하는 데이터 타입이다.

```
public enum week{
	MONDAY,
	TUESDAY,
	.
	.
	.
	SUNDAY
}
```
---

## Ch6.클래스
### 객체 지향 프로그래밍

현실 세계에서 어떤 제품을 만들 때, 부품을 먼저 개발하고 이 부품들을 하나씩 조립해서 완성된 제품을 만들 듯이, 소프트웨어를 개발할 때에도 부품에 해당하는 객체들을 ㅁ너저 만들고, 이것들을 하나씩 졸비해서 완성된 프로그램을 만드는 기법을 객체 지향 프로그래밍이라고 한다. 객체 지향 프로그래밍을 이해하기 위해선 우선 객체의 개념과 객체 상호작용에 대해서 배워야 한다.

### 객체란?
객체란 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것을 말한다. 
- 자동차
- 자전거
- 책
- 사람
- 추상적인 학과, 강의 주문
같은 것들을 객체라고 할 수 있다.

___객체는 속성과 동작으로 구성되어 있다.___ 예를 들어 사람은 이름, 나이 등의 속성과 웃다, 걷다 등의 동작이 있고, 자동차는 색상, 모델명 등의 속성과 달린다, 멈춘다 등의 동작이 있다.

자바는 이 속성과 동작들을 각각
- 필드
- 메소드

라고 부른다.

### 객체의 상호 작용

현실 세계에서 일어나는 모든 현상은 객체와 객체 간의 상호작용으로 이루어 져 있다. 예를 들어 사람은 전자계산기의 기능을 잉요하고, 전자계산기는 계산 결과를 사람에게 알려주는 상호작용을 한다.

객체들은 각각 독립적으로 존재하고, 다른 객체와 서로 상호작용하면서 동작한다. 객체들 사이의 상호작용 수단은 메소드이다. 객체가 다른 객체의 기능을 이용하는 것이 바로 메소드 호출이다.

메소드 호출은 다음과 같은 형태를 가지고 있다. 객체에 도트 연산자를 붙이고 메소드 이름을 기술하면 된다.
```
리턴값 = 전자계산기객체.메소드(매개값1, 매개값2, ...);
```

매개값은 메소드를 실행하기 위해 필요한 데이터이다.

### 상속
일반적으로 상속은 부모 역할의 상위 객체와 자식 역할의 하위 객체가 있다. 상위 객체는 자기가 가지고 있는 필드와 메소드를 하위 객체에게 물려주어 하위 객체가 사용할 수 있도록 한다.
__상위 객체의 수정으로 모든 하위 객체들의 수정 효과를 가져오므로 유지 보수 시간을 최소화 시켜주기도 한다.__

### 다형성
다형성은 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질을 말한다. 코드 측면에서 보면 다형성은 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할 수 있도록 해준다.
다형성의 효과로는 객체는 부품화가 가능하다. 예를 들어 자동차를 설계할 때 타이어 인터페이스 타입을 적용했다면 이 인터페이스를 구현한 실제 타이어들은 어떤 것이든 상관없이 장착(대입)이 가능하다.

### 객체와 클래스
현실에서는 객체가 설계도를 바탕으로 만들어진다. 예를 들어 사람들이 자동차를 이용하기 위해서는 우선 공장에서 설계도를 보고 자동차를 만들어야 한다.메모리에서 사용하고 싶은 객체가  있다면 우선 설계도로 해당 객체를 만드는 작업이 필요하다. 자바는 설계도가 바로 클래스이다. 클래스에는 객체를 생성하기 위한 필드와 메소드가 정의되어 있다. 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스라고 한다. 자동차 객체는 자동차 클래스의 인스턴스인 셈이다. 그리고 클래스로부터 객체를 만드는 과정을 인스턴스화라고 한다.

### 클래스의 구성 멤버
구성 멤버
- 필드
- 생성자
- 메소드
```
public class ClassName{
	//필드
	int fieldName;
	
	//생성자
	ClassName(){
	
	}
	//메소드
	void methodName(){
	
	}
}
```

#### 필드
필드는 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳이다. 필드는 생성자와 메소드 전체에서 사용되며 객체가 소멸되지 않는 한 객체와 함께 존재한다.

#### 생성자
생성자는 new 연산자로 호출되는 중괄호 블록이다. 생성자의 역할은 객체 생성 시 초기화를 담당한다. 생성자는 메소드와 비슷하게 생겼지만, 클래스 이름으로 되어 있고 리턴 타입이 없다.
객체 초기화를 담당한다. 객체 초기화란 필드를 초기화하거나, 메소드를 호출해서 개겣를 사용할 준비를 하는 것을 말한다. 생성자를 실행시키지 않고는 클래스로부터 객체를 만들 수 없다. NEW 연산자에 의해 생성자가 성공적으로 실행되면 힙 영역에 객체가 생성되고 객체의 주소가 리턴된다.


#### 메소드
메소드는 객체 간의 데이터 전달의 수단으로 사용된다.

#### 생성자 오버로딩
외부에서 제공되는 다양한 데이터들을 잉요해서 객체를 초기화하려면 생성자도 다양화될 필요가 있다. car 객체를 생성할 때 외부에서 제공되는 데이터가 없다면 기본 생성자로 CAR 객체를 생성해야하고, 외부에서 MOdel 데이터가 제공되거나 model과 color가 제공될 경우에도 car 객체를 생성할 수 있어야 한다. ___매개 변수를 달리하는 생성자를 여러 개 선언하는 것을 말한다.___

#### 매개 변수의 수를 모를 경우
메소드의 매개변수는 개수가 이미 정해져 있는 것이 일반적이지만, 경우에 따라서는 메소드를 선언할 때 매개변수의 개수를 알수 없는 경우가 있다. 예를 들어 여러 개의 수를 모두 합산하는 메소드를 선언해야 한다면, 몇 개읨 매개 변수가 입력될지 알 수 없기 때문에 매개 변수의 개수를 결정할 수 없을 것이다. 
```
int sum1(int[] valuess) {}
```
### 메소드 오버로딩
클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것을 메소드 오버로딩이라고 한다. 하나의 메소드 이름으로 여러 기능을 담는다 하여 붙여진 이름이라 생각할 수 있다. 메소드 오버로딩의 조건은 매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다.

### 인스턴스 멤버와 this

인스턴스 멤버란 객체를 생성한 후 사용할 수 있는 필드와 메소드를 말하는데, 이들을 각각 인스턴스 필드, 인스턴스 메소드라고 부른다. 우리가 지금까지 작성한 모든 필드와 메소드는 인스턴스 멤버들이었다.

### 패키지
프로젝트를 개발하다 보면 적게는 수십 개, 많게는 수백 개의 클래스를 작성해야 한다. 클래스를 체계적으로 관리하지 않으면 클래스 간의 관계가 뒤엉켜져 복잡하고 난해한 프로그램이 되어 결국 유지 보수가 어렵게 된다.

#### Getter Setter 메소드

일반적으로 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막는다. 그 이유는 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성이 깨어질 수 있기 때문이다. 이러한 문제점을 해결하기 위해 객체 지향 프로그래밍에서는 메소드를 통해서 데이터를 변경하는 방법을 선호한다. 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장해주는 역할을 Setter가 한다.
외부에서 객체의 데이터를 읽을 때도 메소드를 사용하는 것이 좋다. 객체 외부에서 객체의 필드값을 사용하기에 부적절한 경우도 있다. 

### 어노테이션
어노테이션은 메타데이터라고 볼 수 있다. 메타데이터란 애플리케이션이 처리해야 할 데잍터가 아니라 컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지를 알려주는 정보이다. 
어노테이션의 용도
- 컴파일러에게 코드 문법 에러를 체크하도록 정보를 제공
- 소프트웨어 개발 툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보를 제공
- 실행 시 특정 기능을 실행하도록 정보를 제공.

---

## Ch.7 상속
### 상속의 개념

현실에서 상속은 부모가 자식에게 물려주는 행위를 말한다. 자식은 상속을 통해서 부모가 물려준 것을 자연스럽게 이용할 수 있다. 객체 지향 프로그램에서도 부모 클래스의 멤버를 자식 클래스에게 물려줄 수 있다. 프로그램에서는 부모 클래스를 상위 클래스라고 부르기도 하고, 자식 클래스를 하위 클래스 또는 파생 클래스라고 부른다.

```
class 자식클래스 extends 부모클래스 {
	//필드
	//생성자
	//메소드
}
```




템플릿 메소드 패턴

상위 클래스에서 알고리즘의 레이아웃을 제공하고, 하위 클래스에서 해당 알고리즘을 구체화 한다.
만일 공통으로 쓰일 코드가 있다면 추상 클래스에서 구현한다.

이번 프로젝트에선 공통으로 쓰일 코드가 없기에 TempleteAfterCry라는 인터페이스로 만들었다.
해당 템플릿은 울고나서의 과정에 대한 레이아웃을 제공한다.

1. 울고 난 직후
2. 울고 나서 1일 후
3. 울고 나서 일주일 후

사람마다 울고나서의 행동들은 다르니 상위 클래스인 TempleteAfterCry 인터페이스에선 알고리즘의 뼈대를 잡고
그걸 상속받은 Person 클래스, 그리고 Person 클래스를 상속받는 각각 LeeYangHee, KimJunHyuck 클래스에서
해당 알고리즘의 내용을 구체화 하였다.

스트레티지 패턴과 어떻게 차이를 둬야 할까?
내가 느끼기엔 이 둘의 차이점은 언제 사용하냐에 따라 달라질 수 있는 것 같다.

예를 들어 검사, 궁수, 마법사가 있다고 치자.
3개의 클래스 모두 기본적인 3가지 함수가 있다. 

1. 휴식 모드
2. 훈련 모드
3. 공격 준비 모드

*휴식 모드
이 함수는 검사, 궁수, 마법사 직업에 상관없이 누구든 사용하면 똑같이 앉아서 쉬게 해준다.
따라서 공통 함수로 쓰인다.

*훈련 모드
훈련 모드 함수가 사용되면 얘기가 달라진다.
-검사는 훈련 할 때 짚으로 된 허수아비에 검 실력을 연마한다.
-궁수는 과녁에 자신의 활을 쏴 궁술을 연마한다.
-마법사는 강력해서 바위에 자신의 마법을 발동해 마술을 연마한다. 

*공격 준비 모드
공격 준비 모드 함수도 마찬가지이다.
-검사는 칼을 꺼내 전방에 배치된다.
-궁수는 화살을 활에 장착하고 후방으로 배치된다.
-마법사는 지팡이를 꺼내고 최후방으로 배치된다.

위 내용들을 클래스로 만들면 어떨까?
아마도 아래와 같은 형태가 나올 것이다.

*병사에 대한 템플릿 상위 클래스
알고리즘의 뼈대를 제공한다.
public abstract TempleteSolider {

	//공통 알고리즘 함수
	public void restMode() {
		//rest...
	}
	
	public abstract void trainingMode();
	public abstract void readyForAttackMode();
}

*검사에 대한 클래스, 템플릿을 상속받아 검사 클래스에게 알고리즘 구체화를 위임하고 있다.
public KniteSolider extends TempleteSolider {
	
	@Override
	public void trainingMode() {
		//검사가 훈련할 때..
	}
	
	@Override
	public void readyForAttackMode() {
		//검사가 공격 준비를 할 때..
	}
}

*궁수에 대한 클래스, 템플릿을 상속받아 궁수 클래스에게 알고리즘 구체화를 위임하고 있다.
public ArcherSolider extends TempleteSolider {
	
	@Override
	public void trainingMode() {
		//궁수가 훈련할 때..
	}
	
	@Override
	public void readyForAttackMode() {
		//궁수가 공격 준비를 할 때..
	}
}

*마법사 생략.

보는 바와 같이 템플릿 메소드 패턴으로 구현을 했더니 깔끔하게 짜여진 것 같다.
그렇다면 스트래티지 패턴을 어디에 적용시킬 수 있을까?
알고리즘 교환이 가능해야 하는데 교환할 수 있는 부분이 어디에 있을까?

restMode를 생각해보자.
쉬는 방법에 앉아서 쉬기, 누워서 쉬기, 잠자기, 명상하기 총 4가지가 있다고 가정하자.
이 4가지 방법은 공통의 인터페이스를 갖는다.

public interface Rest {
	
	public void doRest();
}

그리고 4가지 모두 쉬는 방법(알고리즘)이 다르다. 하지만 기본적으로 쉰다는 것에 대해선 같다.
따라서 클라이언트가 원할 떄 언제든지 앉아서 쉬기->잠자기 등으로 유연하게 바뀔수 있어야 한다.

public class RestSitDown impletements Rest {

	@Override
	public void doRest() {
		//앉아서 쉴 때..
	}
}

public class RestSleep impletements Rest {

	@Override
	public void doRest() {
		//잠을 자서 쉴 떄..
	}
}

이렇게 되면
'검사가 쉴 때에는 앉아서 쉬게 해주세요'
'궁수가 쉴 때에는 잠자게 해주세요'
라는 요청도 가능해진다.

public KniteSolider extends TempleteSolider {
	
	public void rest() {
		//검사가 쉴 때는 앉아서 쉰다...
		Rest rest = new RestSitDown();
		rest.doRest();
	}
	
	...
}

public ArcherSolider extends TempleteSolider {
	
	public void rest() {
		//궁수가 쉴 때는 잠을 잔다...
		Rest rest = new RestSleep();
		rest.doRest();
	}
	
	...
}
 
 나쁘지 않지만 rest함수에 Rest 객체를 파라미터로 넘겨 좀 더 깔끔하게 정리해보자.
 
 public abstract TempleteSolider {

	//공통 알고리즘 함수
	//Rest 객체를 받는 파라미터와 실행 코드가 추가되었다.
	public void restMode(Rest rest) {
		//rest...
		rest.doRest();
	}
	
	public abstract void trainingMode();
	public abstract void readyForAttackMode();
}

public KniteSolider extends TempleteSolider {
	
	public void rest(Rest rest) {
		//검사가 쉴 때는 앉아서 쉰다...
		rest.doRest();
	}
	
	...
}

public class Main {

	public static void main(String[] args) {
		KniteSolider kniteSolider = new KniteSolider();
		kniteSolider.rest(new RestSitDown());
		...
	}
}

각 병사가 행동할 수 있는 것!들에 대한 뼈대는 템플릿 메소드 패턴을 사용하였고
각 행동에 대한 상세 알고리즘은 스트래티지 패턴을 사용해서 교환 가능하도록 만들었다.

이처럼 템플릿 메소드 패턴과 스트래티지 패턴을 굳이 같은 것으로 치부하려 하지 말고,
상황과 적용하려는 틀에 따라 적절히 사용하자.
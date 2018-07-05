팩토리 패턴

이 패턴은 책체 생성을 서브 클래스에게 위임한다.
필요성을 느낄 수 있는 가장 좋은 예시는 아래와 같다.

만일 입력된 과일 이름을 받아 해당 과일의 가격표륿 보여준다고 하자.
과일 클래스는 크게 사과, 바나나, 멜론이 있다.
각각의 클래스에서는 해당 가격을 보여주는 getPrice()의 공통 메서드가 구현되어 있다.
사과 - 1000원
바나나 - 2000원
멜론 - 3000원

*사과 클래스
public class Apple {
	
	private int price = 1000;
	
	public int getPrice() {
		return price;
	}
}

바나나, 멜론은 생략

이제 메인 메서드에서 실행 로직을 작성한다.

public class Main {

	public static void main(String[] args) {
		String name = "사과";
		
		if("사과".equals(name)) {
			Apple apple = new Apple();
			apple.getPrice();
		
		}else if("바나나".equals(name)) {
			Banana banana = new Banana();
			banana.getPrice();
		
		}else if("멜론".equals(name)) {
			Melon melon = new Melon();
			melon.getPrice();
		}
	}
}

팩토리 패턴을 이용하면 위와 같은 로직을 줄일 수 있다.
팩토리 패턴은 객체 생성을 서브 클래스에게 위임한다고 했으니 서브 클래스가 상속받아 오버라이딩 할 수 있게 만든다.

*과일들은 getPrice라는 공통의 메서드를 갖는다.
public interface Fruit {
	
	public int getPrice();
}

public class Apple implements Fruit {
	
	private int price = 1000;
	
	@Override
	public int getPrice() {
		return price;
	}
}

*바나나, 멜론은 생략

이제 슈퍼 클래스인 Fruit은 Apple과 Banana, Melon을 참조할 수 있다.

*과일은 공장에서 가져온다
public interface FruitFactory {
	
	public Fruit getFruit(String name);
}

*FruitFactory를 상속받은 서브 클래스 FruitFactoryImpl가 객체 생성을 맡는다.
public Class FruitFactoryImpl implements FruitFactory {

	@Override
	public Fruit getFruit(String name) {
		Fruit fruit = null;
		
		if("사과".equals(name)) {
			fruit = new Apple();
		
		}else if("바나나".equals(name)) {
			fruit = new Banana();
		
		}else if("멜론".equals(name)) {
			fruit = new Melon();
		}
		
		return fruit;
	}
}

public class Main {

	public static void main(String[] args) {
		String name = "사과";
		FruitFactory fruitFactory = new FruitFactoryImpl();
		Fruit fruit = fruitFactory.getFruit(name);
		fruit.getPrice(); //1000
	}
}



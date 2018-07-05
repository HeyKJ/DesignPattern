���丮 ����

�� ������ åü ������ ���� Ŭ�������� �����Ѵ�.
�ʿ伺�� ���� �� �ִ� ���� ���� ���ô� �Ʒ��� ����.

���� �Էµ� ���� �̸��� �޾� �ش� ������ ����ǥ�b �����شٰ� ����.
���� Ŭ������ ũ�� ���, �ٳ���, ����� �ִ�.
������ Ŭ���������� �ش� ������ �����ִ� getPrice()�� ���� �޼��尡 �����Ǿ� �ִ�.
��� - 1000��
�ٳ��� - 2000��
��� - 3000��

*��� Ŭ����
public class Apple {
	
	private int price = 1000;
	
	public int getPrice() {
		return price;
	}
}

�ٳ���, ����� ����

���� ���� �޼��忡�� ���� ������ �ۼ��Ѵ�.

public class Main {

	public static void main(String[] args) {
		String name = "���";
		
		if("���".equals(name)) {
			Apple apple = new Apple();
			apple.getPrice();
		
		}else if("�ٳ���".equals(name)) {
			Banana banana = new Banana();
			banana.getPrice();
		
		}else if("���".equals(name)) {
			Melon melon = new Melon();
			melon.getPrice();
		}
	}
}

���丮 ������ �̿��ϸ� ���� ���� ������ ���� �� �ִ�.
���丮 ������ ��ü ������ ���� Ŭ�������� �����Ѵٰ� ������ ���� Ŭ������ ��ӹ޾� �������̵� �� �� �ְ� �����.

*���ϵ��� getPrice��� ������ �޼��带 ���´�.
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

*�ٳ���, ����� ����

���� ���� Ŭ������ Fruit�� Apple�� Banana, Melon�� ������ �� �ִ�.

*������ ���忡�� �����´�
public interface FruitFactory {
	
	public Fruit getFruit(String name);
}

*FruitFactory�� ��ӹ��� ���� Ŭ���� FruitFactoryImpl�� ��ü ������ �ô´�.
public Class FruitFactoryImpl implements FruitFactory {

	@Override
	public Fruit getFruit(String name) {
		Fruit fruit = null;
		
		if("���".equals(name)) {
			fruit = new Apple();
		
		}else if("�ٳ���".equals(name)) {
			fruit = new Banana();
		
		}else if("���".equals(name)) {
			fruit = new Melon();
		}
		
		return fruit;
	}
}

public class Main {

	public static void main(String[] args) {
		String name = "���";
		FruitFactory fruitFactory = new FruitFactoryImpl();
		Fruit fruit = fruitFactory.getFruit(name);
		fruit.getPrice(); //1000
	}
}



package people;

import templete.TempleteAfterCry;

public class KimJunHyuck extends Person implements TempleteAfterCry {

	@Override
	public void dispalyName() {
		System.out.println("�������̶�� �մϴ�. �ߺ�Ź�帱�Կ�");
	}

	@Override
	public void hurt() {
		System.out.println("��? �̾������� ��Ҵٰ��?");
	}

	@Override
	public void afterCrying() {
		System.out.println("���� ����� ����� Ǯ�ȴ�."); //�����̴� ���ϴ�.
	}

	@Override
	public void oneDayPassedAfterCrying() {
		System.out.println("�ٻڰ� ��ٺ��� ���� �� ������� ����� �ȳ���."); //��� ���ȷ��� ��� ���ϴ� ô �ϴ� �� ����.
	}

	@Override
	public void oneWeekPassedAfterCrying() {
		System.out.println("�� �´�. �� ���������� �̾����� ��Ҵٴ� �Ҹ��� �������.."); //��� �����̴� �ҽ����̴�
	}

}

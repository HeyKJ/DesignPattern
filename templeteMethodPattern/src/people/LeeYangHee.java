package people;

import templete.TempleteAfterCry;

public class LeeYangHee extends Person implements TempleteAfterCry {

	@Override
	public void dispalyName() {
		System.out.println("�̾����Դϴ�. �̾�ȣ!");
	}

	@Override
	public void hurt() {
		System.out.println("�Ҵߺ������� �ʹ� �ſ�");
	}

	@Override
	public void afterCrying() {
		System.out.println("������ ������ �ʾ�.."); //����� ������ ���ϴ�.
	}

	@Override
	public void oneDayPassedAfterCrying() {
		System.out.println("�����ϸ� �����ϸ� ������ ������ �ʾ�.."); //�ٷ� �������� �����ϱ� ������ ������ �����̴�.
	}

	@Override
	public void oneWeekPassedAfterCrying() {
		System.out.println("���������� �����ϸ� ������ ������ �ʾ�.."); //���� �����Ϸ� ������ ����� �������� ����.
	}

}

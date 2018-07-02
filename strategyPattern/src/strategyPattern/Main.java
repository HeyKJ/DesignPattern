package strategyPattern;

import function.CutyCry;
import function.LoudCry;
import people.KimJunHyuck;
import people.LeeYangHee;

public class Main {

	public static void main(String[] args) {
		LeeYangHee leeYangHee = new LeeYangHee();

		try {
			System.out.println("[ù��° ���]");
			leeYangHee.dispalyName(); //�̸� ���
			leeYangHee.setCryType(new LoudCry()); //�ò����� ���� �Ҹ��� ����, ������ ����� �����ϰ� ��� ��Ÿ���� �ƴϴ�
			leeYangHee.hurt(); //������ ������ �Ҵߺ������̴�
			leeYangHee.excuteCry(); //���� �Ҹ� ����

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		KimJunHyuck kimJunHyuck = new KimJunHyuck();

		try {
			System.out.println("[�ι�° ���]");
			kimJunHyuck.dispalyName(); //�̸� ���
			kimJunHyuck.setCryType(new CutyCry()); //�Ϳ��� ���� �Ҹ��� ����, ����ſ� �ٸ��� �Ϳ��� ������ ã�ƺ� �� �ִ�
			kimJunHyuck.hurt(); //�����̴� ����ɷ� ��� ������� �´�
			kimJunHyuck.excuteCry(); //���� �Ҹ� ����

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

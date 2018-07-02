package strategyPattern;

import function.CutyCry;
import function.LoudCry;
import function.SilenceCry;
import people.KimJunHyuck;
import people.LeeYangHee;
import people.Person;

public class Main {

	public static void main(String[] args) {
		Person leeYangHee = new LeeYangHee();

		try {
			System.out.println("[ù��° ���]");
			leeYangHee.dispalyName(); //�̸� ���
			leeYangHee.hurt(); //������ ������ �Ҵߺ������̴�
			leeYangHee.excuteCry(new LoudCry()); //�ò����� ���� �Ҹ��� ����, ������ ����� �����ϰ� ��� ��Ÿ���� �ƴϴ�
			
			leeYangHee.hurt(); //�ΰ��� �Ǽ��� ���� ����. ����� �Ǵٽ� �Ҵߺ������� �Ծ���.
			leeYangHee.excuteCry(new SilenceCry()); //������ ���� �Ҹ��� ����, ���̻� ���񿡰Դ� �� ���� �������� �ʴ�.

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		Person kimJunHyuck = new KimJunHyuck();

		try {
			System.out.println("[�ι�° ���]");
			kimJunHyuck.dispalyName(); //�̸� ���
			kimJunHyuck.hurt(); //�����̴� ����ɷ� ��� ������� �´�
			kimJunHyuck.excuteCry(new CutyCry()); //�Ϳ��� ���� �Ҹ��� ����, ����ſ� �ٸ��� �Ϳ��� ������ ã�ƺ� �� �ִ�

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

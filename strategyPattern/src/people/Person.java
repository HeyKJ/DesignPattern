package people;

import function.Cry;

public abstract class Person {

	//���� �Ҹ� ����
	public void excuteCry(Cry cry) throws Exception {
		if(cry == null) throw new NullPointerException("cry is null! please call setCryType method...");
		else cry.cryPerson();
	}
	
	//�̸� ���
	public abstract void dispalyName();

	//��ó
	public abstract void hurt();
}

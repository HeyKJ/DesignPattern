package people;

import function.Cry;

public abstract class Person {

	private Cry cry = null;

	//���� �Ҹ� ����
	public void setCryType(Cry cry) {
		this.cry = cry;
	}
	
	//���� �Ҹ� ����
	public void excuteCry() throws Exception {
		if(cry == null) throw new NullPointerException("cry is null! please call setCryType method...");
		else cry.cryPerson();
	}
	
	//�̸� ���
	public abstract void dispalyName();

	//��ó
	public abstract void hurt();
}

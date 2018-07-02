package people;

import function.Cry;

public abstract class Person {

	//울음 소리 실행
	public void excuteCry(Cry cry) throws Exception {
		if(cry == null) throw new NullPointerException("cry is null! please call setCryType method...");
		else cry.cryPerson();
	}
	
	//이름 출력
	public abstract void dispalyName();

	//상처
	public abstract void hurt();
}

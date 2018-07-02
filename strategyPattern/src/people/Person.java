package people;

import function.Cry;

public abstract class Person {

	private Cry cry = null;

	//울음 소리 지정
	public void setCryType(Cry cry) {
		this.cry = cry;
	}
	
	//울음 소리 실행
	public void excuteCry() throws Exception {
		if(cry == null) throw new NullPointerException("cry is null! please call setCryType method...");
		else cry.cryPerson();
	}
	
	//이름 출력
	public abstract void dispalyName();

	//상처
	public abstract void hurt();
}

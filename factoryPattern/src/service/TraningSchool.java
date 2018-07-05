package service;

import army.Army;
import army.Marine;
import army.Navy;
import army.Sniper;

public class TraningSchool implements TrainingFactory {

	@Override
	public Army doForcedEnlistment(String name) {
		Army army = null;

		if("Marine".equals(name)) {
			army = new Marine();
			
		}else if("Navy".equals(name)) {
			army = new Navy();
			
		}else if("Sniper".equals(name)) {
			army = new Sniper();
			
		}else {
			System.out.println("지원하지 않는 병과입니다.");
			return null;
		}

		return army;
	}
}

package main;

import army.Army;
import service.TraningSchool;

public class Main {

	public static void main(String[] args) {
		String name = "Sniper";
		TraningSchool traningSchool = new TraningSchool();
		Army army = traningSchool.doForcedEnlistment(name);
		army.startTraining();
		army.training();
		army.completeTraining();
		
		System.out.println();
		
		name = "Marine";
		army = traningSchool.doForcedEnlistment(name);
		army.startTraining();
		army.training();
		army.completeTraining();
		
		System.out.println();

		name = "Navy";
		army = traningSchool.doForcedEnlistment(name);
		army.startTraining();
		army.training();
		army.completeTraining();
	}
	
}

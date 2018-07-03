package people;

import templete.TempleteAfterCry;

public class LeeYangHee extends Person implements TempleteAfterCry {

	@Override
	public void dispalyName() {
		System.out.println("이양희입니다. 이야호!");
	}

	@Override
	public void hurt() {
		System.out.println("불닭볶음면이 너무 매워");
	}

	@Override
	public void afterCrying() {
		System.out.println("울음이 멈추질 않아.."); //양희는 감성이 약하다.
	}

	@Override
	public void oneDayPassedAfterCrying() {
		System.out.println("어제일만 생각하면 울음이 멈추질 않아.."); //바로 어제일은 생생하기 때문에 슬프기 마련이다.
	}

	@Override
	public void oneWeekPassedAfterCrying() {
		System.out.println("일주일전만 생각하면 울음이 멈추질 않아.."); //고작 일주일로 양희의 기분이 나아질리 없다.
	}

}

package people;

import templete.TempleteAfterCry;

public class KimJunHyuck extends Person implements TempleteAfterCry {

	@Override
	public void dispalyName() {
		System.out.println("김준혁이라고 합니다. 잘부탁드릴게요");
	}

	@Override
	public void hurt() {
		System.out.println("예? 미쓰라진을 닮았다고요?");
	}

	@Override
	public void afterCrying() {
		System.out.println("막상 울고나니 기분이 풀렸다."); //준혁이는 쿨하다.
	}

	@Override
	public void oneDayPassedAfterCrying() {
		System.out.println("바쁘게 살다보니 어제 왜 울었는지 기억이 안난다."); //운게 쪽팔려서 기억 못하는 척 하는 것 같다.
	}

	@Override
	public void oneWeekPassedAfterCrying() {
		System.out.println("아 맞다. 난 일주일전에 미쓰라진 닮았다는 소리를 들었었다.."); //사실 준혁이는 소심쟁이다
	}

}

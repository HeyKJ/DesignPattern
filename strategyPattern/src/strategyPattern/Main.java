package strategyPattern;

import function.CutyCry;
import function.LoudCry;
import people.KimJunHyuck;
import people.LeeYangHee;
import people.Person;

public class Main {

	public static void main(String[] args) {
		Person leeYangHee = new LeeYangHee();

		try {
			System.out.println("[첫번째 사람]");
			leeYangHee.dispalyName(); //이름 출력
			leeYangHee.setCryType(new LoudCry()); //시끄러운 울음 소리로 지정, 실제로 양희는 조용하게 우는 스타일이 아니다
			leeYangHee.hurt(); //양희의 아픔은 불닭볶음면이다
			leeYangHee.excuteCry(); //울음 소리 실행

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		Person kimJunHyuck = new KimJunHyuck();

		try {
			System.out.println("[두번째 사람]");
			kimJunHyuck.dispalyName(); //이름 출력
			kimJunHyuck.setCryType(new CutyCry()); //귀여운 울음 소리로 지정, 생긴거와 다르게 귀여운 구석을 찾아볼 수 있다
			kimJunHyuck.hurt(); //준혁이는 생긴걸로 놀리면 우울증이 온다
			kimJunHyuck.excuteCry(); //울음 소리 실행

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

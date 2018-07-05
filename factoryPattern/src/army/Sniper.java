package army;

public class Sniper extends Army {

	@Override
	public void startTraining() {
		System.out.println("저격수가 훈련을 시작합니다.");
	}

	@Override
	public void training() {
		System.out.println("탕탕!");
	}
	
	@Override
	public void completeTraining() {
		System.out.println("이제 카구팔 쓸 수 있다!");
	}

}

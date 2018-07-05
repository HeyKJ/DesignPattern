package army;

public class Marine extends Army {

	@Override
	public void startTraining() {
		System.out.println("해병대가 훈련을 시작합니다.");
	}
	
	@Override
	public void training() {
		System.out.println("악악!");
	}
	
	@Override
	public void completeTraining() {
		System.out.println("이제 귀신 잡을 수 있당!");
	}

}

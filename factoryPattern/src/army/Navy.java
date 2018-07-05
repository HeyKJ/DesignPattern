package army;

public class Navy extends Army {

	@Override
	public void startTraining() {
		System.out.println("해군이 훈련을 시작합니다.");
	}
	
	@Override
	public void training() {
		System.out.println("푸하 푸하!");
	}
	
	@Override
	public void completeTraining() {
		System.out.println("완벽한 물개가 되었다! 엉엉");
	}

}

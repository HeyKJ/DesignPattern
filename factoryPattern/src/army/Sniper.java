package army;

public class Sniper extends Army {

	@Override
	public void startTraining() {
		System.out.println("���ݼ��� �Ʒ��� �����մϴ�.");
	}

	@Override
	public void training() {
		System.out.println("����!");
	}
	
	@Override
	public void completeTraining() {
		System.out.println("���� ī���� �� �� �ִ�!");
	}

}

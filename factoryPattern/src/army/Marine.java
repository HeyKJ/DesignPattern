package army;

public class Marine extends Army {

	@Override
	public void startTraining() {
		System.out.println("�غ��밡 �Ʒ��� �����մϴ�.");
	}
	
	@Override
	public void training() {
		System.out.println("�Ǿ�!");
	}
	
	@Override
	public void completeTraining() {
		System.out.println("���� �ͽ� ���� �� �ִ�!");
	}

}

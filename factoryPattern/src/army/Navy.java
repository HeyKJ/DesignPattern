package army;

public class Navy extends Army {

	@Override
	public void startTraining() {
		System.out.println("�ر��� �Ʒ��� �����մϴ�.");
	}
	
	@Override
	public void training() {
		System.out.println("Ǫ�� Ǫ��!");
	}
	
	@Override
	public void completeTraining() {
		System.out.println("�Ϻ��� ������ �Ǿ���! ����");
	}

}

���ø� �޼ҵ� ����

���� Ŭ�������� �˰����� ���̾ƿ��� �����ϰ�, ���� Ŭ�������� �ش� �˰����� ��üȭ �Ѵ�.
���� �������� ���� �ڵ尡 �ִٸ� �߻� Ŭ�������� �����Ѵ�.

�̹� ������Ʈ���� �������� ���� �ڵ尡 ���⿡ TempleteAfterCry��� �������̽��� �������.
�ش� ���ø��� ������� ������ ���� ���̾ƿ��� �����Ѵ�.

1. ��� �� ����
2. ��� ���� 1�� ��
3. ��� ���� ������ ��

������� ������� �ൿ���� �ٸ��� ���� Ŭ������ TempleteAfterCry �������̽����� �˰����� ���븦 ���
�װ� ��ӹ��� Person Ŭ����, �׸��� Person Ŭ������ ��ӹ޴� ���� LeeYangHee, KimJunHyuck Ŭ��������
�ش� �˰����� ������ ��üȭ �Ͽ���.

��Ʈ��Ƽ�� ���ϰ� ��� ���̸� �־� �ұ�?
���� �����⿣ �� ���� �������� ���� ����ϳĿ� ���� �޶��� �� �ִ� �� ����.

���� ��� �˻�, �ü�, �����簡 �ִٰ� ġ��.
3���� Ŭ���� ��� �⺻���� 3���� �Լ��� �ִ�. 

1. �޽� ���
2. �Ʒ� ���
3. ���� �غ� ���

*�޽� ���
�� �Լ��� �˻�, �ü�, ������ ������ ������� ������ ����ϸ� �Ȱ��� �ɾƼ� ���� ���ش�.
���� ���� �Լ��� ���δ�.

*�Ʒ� ���
�Ʒ� ��� �Լ��� ���Ǹ� ��Ⱑ �޶�����.
-�˻�� �Ʒ� �� �� ¤���� �� ����ƺ� �� �Ƿ��� �����Ѵ�.
-�ü��� ���ῡ �ڽ��� Ȱ�� �� �ü��� �����Ѵ�.
-������� �����ؼ� ������ �ڽ��� ������ �ߵ��� ������ �����Ѵ�. 

*���� �غ� ���
���� �غ� ��� �Լ��� ���������̴�.
-�˻�� Į�� ���� ���濡 ��ġ�ȴ�.
-�ü��� ȭ���� Ȱ�� �����ϰ� �Ĺ����� ��ġ�ȴ�.
-������� �����̸� ������ ���Ĺ����� ��ġ�ȴ�.

�� ������� Ŭ������ ����� ���?
�Ƹ��� �Ʒ��� ���� ���°� ���� ���̴�.

*���翡 ���� ���ø� ���� Ŭ����
�˰����� ���븦 �����Ѵ�.
public abstract TempleteSolider {

	//���� �˰��� �Լ�
	public void restMode() {
		//rest...
	}
	
	public abstract void trainingMode();
	public abstract void readyForAttackMode();
}

*�˻翡 ���� Ŭ����, ���ø��� ��ӹ޾� �˻� Ŭ�������� �˰��� ��üȭ�� �����ϰ� �ִ�.
public KniteSolider extends TempleteSolider {
	
	@Override
	public void trainingMode() {
		//�˻簡 �Ʒ��� ��..
	}
	
	@Override
	public void readyForAttackMode() {
		//�˻簡 ���� �غ� �� ��..
	}
}

*�ü��� ���� Ŭ����, ���ø��� ��ӹ޾� �ü� Ŭ�������� �˰��� ��üȭ�� �����ϰ� �ִ�.
public ArcherSolider extends TempleteSolider {
	
	@Override
	public void trainingMode() {
		//�ü��� �Ʒ��� ��..
	}
	
	@Override
	public void readyForAttackMode() {
		//�ü��� ���� �غ� �� ��..
	}
}

*������ ����.

���� �ٿ� ���� ���ø� �޼ҵ� �������� ������ �ߴ��� ����ϰ� ¥���� �� ����.
�׷��ٸ� ��Ʈ��Ƽ�� ������ ��� �����ų �� ������?
�˰��� ��ȯ�� �����ؾ� �ϴµ� ��ȯ�� �� �ִ� �κ��� ��� ������?

restMode�� �����غ���.
���� ����� �ɾƼ� ����, ������ ����, ���ڱ�, ����ϱ� �� 4������ �ִٰ� ��������.
�� 4���� ����� ������ �������̽��� ���´�.

public interface Rest {
	
	public void doRest();
}

�׸��� 4���� ��� ���� ���(�˰���)�� �ٸ���. ������ �⺻������ ���ٴ� �Ϳ� ���ؼ� ����.
���� Ŭ���̾�Ʈ�� ���� �� �������� �ɾƼ� ����->���ڱ� ������ �����ϰ� �ٲ�� �־�� �Ѵ�.

public class RestSitDown impletements Rest {

	@Override
	public void doRest() {
		//�ɾƼ� �� ��..
	}
}

public class RestSleep impletements Rest {

	@Override
	public void doRest() {
		//���� �ڼ� �� ��..
	}
}

�̷��� �Ǹ�
'�˻簡 �� ������ �ɾƼ� ���� ���ּ���'
'�ü��� �� ������ ���ڰ� ���ּ���'
��� ��û�� ����������.

public KniteSolider extends TempleteSolider {
	
	public void rest() {
		//�˻簡 �� ���� �ɾƼ� ����...
		Rest rest = new RestSitDown();
		rest.doRest();
	}
	
	...
}

public ArcherSolider extends TempleteSolider {
	
	public void rest() {
		//�ü��� �� ���� ���� �ܴ�...
		Rest rest = new RestSleep();
		rest.doRest();
	}
	
	...
}
 
 ������ ������ rest�Լ��� Rest ��ü�� �Ķ���ͷ� �Ѱ� �� �� ����ϰ� �����غ���.
 
 public abstract TempleteSolider {

	//���� �˰��� �Լ�
	//Rest ��ü�� �޴� �Ķ���Ϳ� ���� �ڵ尡 �߰��Ǿ���.
	public void restMode(Rest rest) {
		//rest...
		rest.doRest();
	}
	
	public abstract void trainingMode();
	public abstract void readyForAttackMode();
}

public KniteSolider extends TempleteSolider {
	
	public void rest(Rest rest) {
		//�˻簡 �� ���� �ɾƼ� ����...
		rest.doRest();
	}
	
	...
}

public class Main {

	public static void main(String[] args) {
		KniteSolider kniteSolider = new KniteSolider();
		kniteSolider.rest(new RestSitDown());
		...
	}
}

�� ���簡 �ൿ�� �� �ִ� ��!�鿡 ���� ����� ���ø� �޼ҵ� ������ ����Ͽ���
�� �ൿ�� ���� �� �˰����� ��Ʈ��Ƽ�� ������ ����ؼ� ��ȯ �����ϵ��� �������.

��ó�� ���ø� �޼ҵ� ���ϰ� ��Ʈ��Ƽ�� ������ ���� ���� ������ ġ���Ϸ� ���� ����,
��Ȳ�� �����Ϸ��� Ʋ�� ���� ������ �������.
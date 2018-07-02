package adapter;

import function.cry.Cry;
import function.expression.Expression;

/**
 * 
 * @author HEYKJ
 * 
 * Adapter ����
 * �߰��� ǥ�� ������� ���� �Ƿ��� ���� �Ҹ��� �����ϰ� �ִ�.
 * Adapter ������� ���� Cry ����� �������� �ʾ����� ȣȯ���� ���� Expression ����� �����ؼ� ����ϰ� �ִ�.
 * ���� ����� ���� �Ҹ��� ���� �ʹٸ� Adapter�� ������� ������ �ȴ�.
 * 
 */
public class AdapterCry implements Cry {

	private Cry cry;
	private Expression expression;
	
	public AdapterCry(Cry cry, Expression expression) {
		this.cry = cry;
		this.expression = expression;
	}
	
	@Override
	public void cryPerson() {
		this.expression.showExpression();
		this.cry.cryPerson();
	}

}

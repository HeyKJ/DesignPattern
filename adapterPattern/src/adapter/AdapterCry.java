package adapter;

import function.cry.Cry;
import function.expression.Expression;

/**
 * 
 * @author HEYKJ
 * 
 * Adapter 구현
 * 추가된 표정 기능으로 인해 훌룡한 울음 소리를 제공하고 있다.
 * Adapter 목적답게 기존 Cry 기능은 수정하지 않았으며 호환성이 없던 Expression 기능을 연결해서 사용하고 있다.
 * 원래 기능인 울음 소리만 내고 싶다면 Adapter를 사용하지 않으면 된다.
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

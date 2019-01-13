
/**
 * ���ս���ʽ������Ϊ�˼򵥣���","�ָ�
 * 
 */
public class AndExpression implements Expression {

	private Expression age;
	private Expression idCard;

	public AndExpression(Expression age, Expression idCard) {
		this.age = age;
		this.idCard = idCard;
	}

	@Override
	public boolean interpret(String context) {
		String s[] = context.split(",");
		boolean reslt = age.interpret(s[0]) && idCard.interpret(s[1]);
		System.out.println(context+": "+(reslt?"����":"������")+"����");
		return reslt;
	}

}

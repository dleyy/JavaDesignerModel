
/**
 * 非终结表达式，这里为了简单，以","分隔
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
		System.out.println(context+": "+(reslt?"可以":"不可以")+"进入");
		return reslt;
	}

}

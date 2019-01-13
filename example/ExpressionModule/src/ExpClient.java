
public class ExpClient {
	public static void main(String[] args) {
		TerminalExpression age = new TerminalExpression("18");
		TerminalExpression idCard = new TerminalExpression("有身份证");
		
		AndExpression canIn = new AndExpression(age, idCard);
		
		canIn.interpret("年龄18,有身份证");
		canIn.interpret("年龄17,有身份证");
		canIn.interpret("年龄19,有身份证");
		canIn.interpret("年龄19,没身份证");
		canIn.interpret("年龄17,没身份证");
		
	}
}

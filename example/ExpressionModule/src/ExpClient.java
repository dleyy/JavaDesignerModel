
public class ExpClient {
	public static void main(String[] args) {
		TerminalExpression age = new TerminalExpression("18");
		TerminalExpression idCard = new TerminalExpression("�����֤");
		
		AndExpression canIn = new AndExpression(age, idCard);
		
		canIn.interpret("����18,�����֤");
		canIn.interpret("����17,�����֤");
		canIn.interpret("����19,�����֤");
		canIn.interpret("����19,û���֤");
		canIn.interpret("����17,û���֤");
		
	}
}


/**
 * 终结符表达式类
 */
public class TerminalExpression implements Expression {

	private String data;
	
	public TerminalExpression(String data){
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data)){
			return true;
		}else if(context.contains("年龄")){
			//这里为了简单，就默认所有的句子都是合法的。
			int age = Integer.parseInt(context.substring(2));
			return age>=Integer.parseInt(data);
		}else{
			return false;
		}
	}
	
}

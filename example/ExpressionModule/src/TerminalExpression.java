
/**
 * �ս�����ʽ��
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
		}else if(context.contains("����")){
			//����Ϊ�˼򵥣���Ĭ�����еľ��Ӷ��ǺϷ��ġ�
			int age = Integer.parseInt(context.substring(2));
			return age>=Integer.parseInt(data);
		}else{
			return false;
		}
	}
	
}

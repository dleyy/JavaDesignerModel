
/**
 * 
 * �����Ԫ����A(ConcreteElement)
 *
 */
public class DocA extends Doc {

	//ʹ��accept������ֻ��ָ����visiter���ܷ��ʡ�
	@Override
	public void accept(Visiter visiter) {
		visiter.visit(this);
	}

	@Override
	public String readDoc() {
		return "This is DocA";
	}

}

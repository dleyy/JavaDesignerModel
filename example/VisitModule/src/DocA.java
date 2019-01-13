
/**
 * 
 * 具体的元素类A(ConcreteElement)
 *
 */
public class DocA extends Doc {

	//使用accept，代表只有指定的visiter才能访问。
	@Override
	public void accept(Visiter visiter) {
		visiter.visit(this);
	}

	@Override
	public String readDoc() {
		return "This is DocA";
	}

}


/**
 * 具体的元素类B(ConcreteElement)
 *
 */
public class DocB extends Doc{

	@Override
	public void accept(Visiter visiter) {
		visiter.Visit(this);
	}

	@Override
	public String readDoc() {
		return "This is DocB";
	}

}

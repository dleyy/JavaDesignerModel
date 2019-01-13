
/**
 * 具体的访问者
 *
 */
public class VisiterA implements Visiter {

	@Override
	public void visit(DocA doca) {
		System.out.println("DocA's content is:" + doca.readDoc());
	}

	@Override
	public void Visit(DocB docb) {
		System.out.println("DocB's content is:" + docb.readDoc());
	}

}

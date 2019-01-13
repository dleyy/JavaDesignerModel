
public class BoyBuilder extends IBuilder {

	@Override
	public void createHeard() {
		human.setHeard("Boy's heard");
	}

	@Override
	public void createBody() {
		human.setBody("Boy's body");
	}

	@Override
	public void createFoot() {
		human.setFoot("Boy's foot");
	}

}


public class WebDemand implements Demand {
	
	private Coders coders;

	public WebDemand(Coders coders) {
		this.coders = coders;
	}

	@Override
	public void execute() {
		coders.doWeb();
	}
}

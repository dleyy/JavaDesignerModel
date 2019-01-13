
public class RestState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Rest");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Rest State";
	}
}

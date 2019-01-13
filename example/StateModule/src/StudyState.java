
public class StudyState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Study");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Study State";
	}
}

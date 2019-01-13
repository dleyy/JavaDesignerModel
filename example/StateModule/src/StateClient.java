
public class StateClient {
	public static void main(String[] args) {
		Context context = new Context();
		StudyState state = new StudyState();
		RestState reState = new RestState();
		
		state.doAction(context);
		System.out.println(context.getState().toString());
		
		reState.doAction(context);
		System.out.println(context.getState().toString());

	}
}

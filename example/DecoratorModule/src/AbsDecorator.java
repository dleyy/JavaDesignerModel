
public class AbsDecorator implements View{

	private View view;
	
	public AbsDecorator(View view) {
		this.view = view;
	}
	
	@Override
	public void display() {
		view.display();
	}

}

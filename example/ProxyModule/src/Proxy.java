
/**
 * 代理主题
 * 
 *
 */
public class Proxy implements Subject {
	
	private Subject subject;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void showMessage() {
		checkPermition();
		subject.showMessage();
		doOtherThing();
		
	}

	private void doOtherThing() {
		System.out.println("Do other thing");
	}

	private void checkPermition() {
		System.out.println("Check permition");
	}
	
	

}

/**
 * 符合迪米特法则的，环境类
 *
 */
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}

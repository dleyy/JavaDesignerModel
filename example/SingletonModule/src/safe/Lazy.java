package safe;

public class Lazy {
	private static Lazy lazyInstance = new Lazy();
	
	private Lazy(){};
	
	public static Lazy getInstance(){
		return lazyInstance;
	}
}

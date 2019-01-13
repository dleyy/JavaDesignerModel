package safe;

public class LazySafe {
	private static LazySafe lazy;
	
	private LazySafe(){};
	
	public static synchronized LazySafe getInstance(){
		if(lazy==null){
			lazy = new LazySafe();
		}
		return lazy;
	}
}

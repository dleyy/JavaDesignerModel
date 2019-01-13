package notSafe;

public class LazeM {
	private static LazeM lazem;
	
	private LazeM(){}
	
	public static LazeM getInstance(){
		if(lazem==null){
			lazem = new LazeM();
		}
		return lazem;
	}
}

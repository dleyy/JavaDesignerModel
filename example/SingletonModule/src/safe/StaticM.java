package safe;

public class StaticM {
	private static class StaticMHolder{
		private static final StaticM staticM = new StaticM(); 
	}
	
	private StaticM(){}
	
	public static final StaticM getInstanc(){
		return StaticMHolder.staticM;
	}
}

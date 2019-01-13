package safe;

public class Dcl {
	private volatile static Dcl dcl; 
	
	private Dcl(){}
	
	public static Dcl getInstance(){
		if(dcl==null){
			synchronized(Dcl.class){
				if(dcl==null){
					dcl = new Dcl();
				}
			}
		}
		return dcl;
	} 
}


public class Factory {
	public static ProductFactory getFactory(String name){
		switch (name) {
		case "A":
			return new CAFactory(); 
		case "B":
			return new CBFactory();
		default:
			return new CAFactory(); 
		}
	}
}

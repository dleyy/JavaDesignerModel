
public class test {
	public static void main(String args[]){
		ProductorManager manager = new ProductorManager();
		manager.addWatched(new CoderManA());
		manager.addWatched(new CoderManB());
		
		manager.notifyWatcher();
	}
}

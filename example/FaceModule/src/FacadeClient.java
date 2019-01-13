
public class FacadeClient {
	public static void main(String[] args) {
		AbsFacade faced = new Facade();

		faced.showMessage();
	}
}

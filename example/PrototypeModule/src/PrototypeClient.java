
public class PrototypeClient {
	public static void main(String[] args) {
		Human man = new Human();
		man.setName("����");

		Human cloneMan = man.clone();

		System.out.println(cloneMan.getName());
	}
}

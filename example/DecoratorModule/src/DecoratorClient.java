
public class DecoratorClient {
	public static void main(String[] args) {
		View button = new Button();
		View deco = new ImageDecorator(button);
		deco.display();
	}
}

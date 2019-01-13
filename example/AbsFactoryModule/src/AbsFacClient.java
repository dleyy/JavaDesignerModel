
public class AbsFacClient {
	public static void main(String[] args) {
		ProductFactory factory = Factory.getFactory("B");
		ProductA productA = factory.creatA();
		ProductB productB = factory.creatB();
		
		productA.productA();
		productB.productB();
	}
}

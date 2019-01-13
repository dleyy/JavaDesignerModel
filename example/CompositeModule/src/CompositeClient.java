
public class CompositeClient {
	public static void main(String[] args) {
		Child child1 = new Child("1");
		Child child2 = new Child("2");
		Child child3 = new Child("3");
		Child child4 = new Child("4");
		Child child5 = new Child("5");
		Leaf leaf = new Leaf("р╤вс");
		
		child1.add(child2);
		child1.add(child3);
		child2.add(child4);
		child2.add(child5);
		child2.add(leaf);
		
		child1.operation();
	}
}


public class Client {
	public static void main(String[] args) {
		Originator ora = new Originator();
		ora.setState("HP:200 MP:300");
		MemntoManager manager = new MemntoManager();
		manager.addMemento(ora.saveState());

		ora.setState("HP:1 MP:1");
		manager.addMemento(ora.saveState());

		ora.setState("HP:1000 MP:1000");

		System.out.println("current state:" + ora.getState());

		System.out.println("First state:" + manager.getMemento(0).getState() + '\n'
				+ "Second state :" + manager.getMemento(1).getState());

	}
}

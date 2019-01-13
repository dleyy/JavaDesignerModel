import java.util.ArrayList;

public class Child extends Compositer {

	private ArrayList<Compositer> child;

	public Child(String name) {
		child = new ArrayList<>();
		setName(name);
	}

	@Override
	public void add(Compositer com) {
		child.add(com);
	}

	@Override
	public void remove(Compositer com) {
		child.remove(com);
	}

	@Override
	public Compositer getChild(int index) {
		return index < child.size() ? child.get(index) : null;
	}

	//ѭ�������������
	@Override
	public void operation() {
		System.out.println(getName());
		if (child.size() > 0) {
			for (Compositer item : child) {
				item.operation();
			}
		}
	}

}

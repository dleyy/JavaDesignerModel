
public class Leaf extends Compositer {

	public Leaf(String name) {
		setName(name);
	}

	@Override
	public void add(Compositer com) {
		System.out.println("Can't do it");
	}

	@Override
	public void remove(Compositer com) {
		System.out.println("Can't do it");
	}

	@Override
	public Compositer getChild(int index) {
		System.out.println("Can't do it");
		return null;
	}

	@Override
	public void operation() {
		System.out.println("This is a leaf " + getName());
	}

}

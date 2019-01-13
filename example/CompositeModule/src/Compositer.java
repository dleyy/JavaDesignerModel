
public abstract class Compositer {

	private String name;

	protected void setName(String name) {
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	public abstract void add(Compositer com);

	public abstract void remove(Compositer com);

	public abstract Compositer getChild(int index);

	public abstract void operation(); // 业务方法

}

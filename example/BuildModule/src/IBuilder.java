
public abstract class IBuilder {
	protected Human human = new Human();

	public abstract void createHeard();

	public abstract void createBody();

	public abstract void createFoot();

	public Human build() {
		return human;
	}
}


/**
 * 
 * 抽象元素类：声明 接受何种类型的访问。
 *
 */
public abstract class Doc {
	public abstract void accept(Visiter visiter);
	public abstract String readDoc();
}

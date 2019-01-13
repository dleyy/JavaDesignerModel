/**
 * 具体工厂类 B
 *
 */
public class CBFactory implements ProductFactory{

	@Override
	public ProductA creatA() {
		return new ProductA_CB();
	}

	@Override
	public ProductB creatB() {
		return new ProductB_CB();
	}

}


/**
 * 具体工厂类，A公司
 *
 */
public class CAFactory implements ProductFactory{

	@Override
	public ProductA creatA() {
		return new ProductA_CA();
	}

	@Override
	public ProductB creatB() {
		return new ProductB_CA();
	}

}

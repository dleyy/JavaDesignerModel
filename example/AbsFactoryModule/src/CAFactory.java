
/**
 * ���幤���࣬A��˾
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

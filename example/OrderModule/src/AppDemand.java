
/**
 * app 开发功能。
 * 像外包公司要向客户展示的，我们能做什么一样。
 *这里模拟的是具体的命令。
 */
public class AppDemand implements Demand {

	private Coders coders;

	public AppDemand(Coders coders) {
		this.coders = coders;
	}

	@Override
	public void execute() {
		coders.doApp();
	}

}

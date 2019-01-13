
/**
 * 客户端类，命令的发送与执行
 *
 */
public class Client {
	public static void main(String[] args) {
		//开公司前的准备  向外界提供哪些  命令
		Coders coders = new Coders();
		ProductorManager pm = new ProductorManager();
		AppDemand app = new AppDemand(coders);
		WebDemand web = new WebDemand(coders);
		
		//具体的命令执行
		pm.addDemands(app);
		pm.addDemands(web);
		pm.doProduce();
		
	}
}

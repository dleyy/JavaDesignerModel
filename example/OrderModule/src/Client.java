
/**
 * �ͻ����࣬����ķ�����ִ��
 *
 */
public class Client {
	public static void main(String[] args) {
		//����˾ǰ��׼��  ������ṩ��Щ  ����
		Coders coders = new Coders();
		ProductorManager pm = new ProductorManager();
		AppDemand app = new AppDemand(coders);
		WebDemand web = new WebDemand(coders);
		
		//���������ִ��
		pm.addDemands(app);
		pm.addDemands(web);
		pm.doProduce();
		
	}
}

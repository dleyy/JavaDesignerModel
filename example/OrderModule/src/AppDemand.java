
/**
 * app �������ܡ�
 * �������˾Ҫ��ͻ�չʾ�ģ���������ʲôһ����
 *����ģ����Ǿ�������
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

import active.ActiveProxy;

public class ProxyClient {
	public static void main(String[] args) {
		// Proxy proxy = new Proxy(new RealSubject());
		// proxy.showMessage();

		// ��ȡ�������
		Subject rSub = (Subject) new ActiveProxy(new RealSubject()).getProxyInstance();

		rSub.showMessage();

	}
}

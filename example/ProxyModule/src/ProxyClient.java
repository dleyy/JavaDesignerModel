import active.ActiveProxy;

public class ProxyClient {
	public static void main(String[] args) {
		// Proxy proxy = new Proxy(new RealSubject());
		// proxy.showMessage();

		// 获取代理对象
		Subject rSub = (Subject) new ActiveProxy(new RealSubject()).getProxyInstance();

		rSub.showMessage();

	}
}

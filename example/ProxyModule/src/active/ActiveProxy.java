package active;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 */
public class ActiveProxy {
	
	private Object target;
	
	public ActiveProxy(Object target) {
		this.target = target;
	}
	
	//生成代理对象
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("1");
						Object returnValue = method.invoke(target, args);
						System.out.println("2");
						return returnValue;
					}
				});
	}
}


public class UserB implements User {
	
	@Override
	public void say(ChartRoom chart) {
		chart.sayToA("hello I'm B");
	}

	@Override
	public void getMsg(String msg) {
		System.out.println("B got msg:"+msg);
	}

}

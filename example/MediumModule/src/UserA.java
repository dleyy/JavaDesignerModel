
public class UserA implements User{

	@Override
	public void say(ChartRoom chart) {
		chart.sayToB("Hello I'm A");
	}

	@Override
	public void getMsg(String msg) {
		System.out.println("A got Msg:"+msg);
	}

}

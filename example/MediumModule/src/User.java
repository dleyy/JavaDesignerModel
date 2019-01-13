
public interface User {
	
	/**
	 * 发送消息
	 */
	void say(ChartRoom chart);
	
	/**
	 * 接收消息
	 */
	void getMsg(String msg);
}

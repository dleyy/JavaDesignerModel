
public class MediumClient {
	public static void main(String[] args) {
		System.out.println("初始化聊天室");
		ChartRoom chartRoom = new ChartRoom();
		UserA userA = new UserA();
		UserB userB = new UserB();
		
		chartRoom.setUserA(userA);
		System.out.println("A 加入聊天室");
		chartRoom.setUserB(userB);
		System.out.println("B 加入聊天室");
		
		userA.say(chartRoom);
		userB.say(chartRoom);
	}
}

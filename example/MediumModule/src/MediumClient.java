
public class MediumClient {
	public static void main(String[] args) {
		System.out.println("��ʼ��������");
		ChartRoom chartRoom = new ChartRoom();
		UserA userA = new UserA();
		UserB userB = new UserB();
		
		chartRoom.setUserA(userA);
		System.out.println("A ����������");
		chartRoom.setUserB(userB);
		System.out.println("B ����������");
		
		userA.say(chartRoom);
		userB.say(chartRoom);
	}
}

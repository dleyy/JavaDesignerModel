
public class ChartRoom {
	
	private UserA userA;
	private UserB userB;
	
	public void setUserA(UserA userA) {
		this.userA = userA;
	}

	public void setUserB(UserB userB) {
		this.userB = userB;
	}

	public void sayToB(String msg){
		userB.getMsg(msg);
	}
	
	public void sayToA(String msg){
		userA.getMsg(msg);
	}
	
}


public class Facade extends AbsFacade{

	private Sub1 sub1;
	private Sub2 sub2;
	private Sub3 sub3;
	
	public Facade(){
		sub1 = new Sub1();
		sub2 = new Sub2();
		sub3 = new Sub3();
	}
	
	@Override
	public void showMessage() {
		sub1.showMeessage();
		sub2.showMessage();
		sub3.showMessage();
	}

}


public class BridgeClient {
	public static void main(String[] args) {
		Pen redPencil = new Pencil(new RedColor());
		Pen bluePencil = new Pencil(new BlueColor());
		
		redPencil.write();
		bluePencil.write();
		
	}
}

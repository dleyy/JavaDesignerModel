
public class Pencil extends Pen{

	public Pencil(Color color) {
		super(color);
		
	}

	@Override
	public void write() {
		System.out.println("write "+color.getColor());
	}

}

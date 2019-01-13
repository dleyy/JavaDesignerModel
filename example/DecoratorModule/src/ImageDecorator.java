
public class ImageDecorator extends AbsDecorator{

	public ImageDecorator(View view) {
		super(view);
	}
	
	@Override
	public void display() {
		super.display();
		showImage();
	}
	
	private void showImage(){
		System.out.println("show image");
	}

}

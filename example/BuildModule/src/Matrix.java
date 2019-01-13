
public class Matrix {
	private IBuilder iBuilder;

	public Matrix(IBuilder iBuilder) {
		this.iBuilder = iBuilder;
	}

	public void setiBuilder(IBuilder iBuilder) {
		this.iBuilder = iBuilder;
	}

	public Human builder() {
		iBuilder.createHeard();
		iBuilder.createBody();
		iBuilder.createFoot();
		return iBuilder.build();
	}
}

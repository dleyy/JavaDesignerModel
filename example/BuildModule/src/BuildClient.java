
public class BuildClient {
	public static void main(String[] args) {
		Matrix matrix = new Matrix(new BoyBuilder());
		Human human = matrix.builder();
		System.out.println(human.toString());
	}
}

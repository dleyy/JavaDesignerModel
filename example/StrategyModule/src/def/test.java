package def;

public class test {
	public static void main(String[] args) {
		Environment environment = new Environment(new AddStrategy());
		System.out.println("Result is "+environment.calculate(10, 20));
		
		Environment en = new Environment(new SubtractionStrategy());
		System.out.println("Result is "+en.calculate(10, 20));

	}
}

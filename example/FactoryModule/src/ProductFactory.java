
public class ProductFactory {
	public static Product getProduct(String productType){
		switch(productType){
		case "A":
			return new ProductA();
		case "B":
			return new ProductB();
		
		}
		return new ProductB();
	}
}

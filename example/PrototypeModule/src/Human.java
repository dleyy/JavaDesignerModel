
public class Human implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//定义克隆方法,调用Object的clone方法
	public Human clone() {
		Object obj = null;

		try {
			obj = super.clone();
			return (Human) obj;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("克隆失败");
			return null;
		}
	}
}


public class Human implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�����¡����,����Object��clone����
	public Human clone() {
		Object obj = null;

		try {
			obj = super.clone();
			return (Human) obj;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("��¡ʧ��");
			return null;
		}
	}
}

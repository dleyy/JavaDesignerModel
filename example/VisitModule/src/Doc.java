
/**
 * 
 * ����Ԫ���ࣺ���� ���ܺ������͵ķ��ʡ�
 *
 */
public abstract class Doc {
	public abstract void accept(Visiter visiter);
	public abstract String readDoc();
}

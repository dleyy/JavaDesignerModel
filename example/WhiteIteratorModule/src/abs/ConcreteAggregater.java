package abs;

/**
 * ����ۼ���
 */
public class ConcreteAggregater extends AbsAggregate {

	private Object[] objectArray;
	
	public ConcreteAggregater(Object[] objArray) {
		this.objectArray = objArray;
	}
	
	@Override
	public Itertor createItertor() {
		return new ConcreteItertor(this);
	}
	
	public int size(){
		return objectArray.length;
	}

	/**
	 * �ṩ��ȡ�ߴ�ķ���
	 */
	public Object getElement(int index){
		if(index<size()){
			return objectArray[index];
		}else{
			return null;
		}
	}

}

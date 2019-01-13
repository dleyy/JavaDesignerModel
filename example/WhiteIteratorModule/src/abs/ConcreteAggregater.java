package abs;

/**
 * 具体聚集器
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
	 * 提供获取尺寸的方法
	 */
	public Object getElement(int index){
		if(index<size()){
			return objectArray[index];
		}else{
			return null;
		}
	}

}

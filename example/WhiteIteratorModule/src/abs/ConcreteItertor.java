package abs;

/**
 * 具体迭代器
 *
 */
public class ConcreteItertor implements Itertor{

	// 具体聚集器
	private ConcreteAggregater agg;
	
	//目前索引位置
	private int currentIndex;
	
	//聚集器大小
	private int aggreSize;
	
	public ConcreteItertor(ConcreteAggregater agg) {
		this.agg = agg;
		this.currentIndex = 0;
		this.aggreSize = agg.size();
	}

	@Override
	public void first() {
		currentIndex = 0;
	}

	@Override
	public void next() {
		if(currentIndex<aggreSize){
			currentIndex++;
		}
	}

	@Override
	public boolean isDone() {
		return currentIndex > aggreSize-1;
	}

	@Override
	public Object currentItem() {
		return agg.getElement(currentIndex);
	}

}

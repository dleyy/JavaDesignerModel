package abs;

/**
 * ���������
 *
 */
public class ConcreteItertor implements Itertor{

	// ����ۼ���
	private ConcreteAggregater agg;
	
	//Ŀǰ����λ��
	private int currentIndex;
	
	//�ۼ�����С
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

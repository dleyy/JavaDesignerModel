import java.util.ArrayList;
import java.util.List;

/**
 * ��Ʒ��������ģ����ǵ�����
 *
 */
public class ProductorManager {
	
	private List<Demand> demands = new ArrayList<>();
	
	public void addDemands(Demand demand){
		demands.add(demand);
	}
	
	public void doProduce(){
		for(Demand demand:demands){
			demand.execute();
		}
		demands.clear();
	}
}

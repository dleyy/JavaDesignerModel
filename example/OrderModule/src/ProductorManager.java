import java.util.ArrayList;
import java.util.List;

/**
 * 产品经理。这里模拟的是调用者
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

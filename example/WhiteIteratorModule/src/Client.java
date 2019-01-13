import abs.AbsAggregate;
import abs.ConcreteAggregater;
import abs.Itertor;

public class Client {
	public static void main(String[] args) {
		Object[] objects = {"one","two","three","four","five"};
		AbsAggregate agg = new ConcreteAggregater(objects);
		Itertor it = agg.createItertor();
		while(!it.isDone()){
			System.out.println(it.currentItem());
			it.next();
		}
	}
}

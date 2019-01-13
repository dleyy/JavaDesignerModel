package abs;

/**
 * 抽象聚集器
 *
 */
public abstract class AbsAggregate {
	
	/**
	 * 暴露一个创造迭代器的方法
	 */
	public abstract Itertor createItertor();
}

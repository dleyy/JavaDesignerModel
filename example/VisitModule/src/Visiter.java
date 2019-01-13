
/**
 * 
 * 抽象访问者类：申明可以访问哪些元素
 *
 */
public interface Visiter {
	void visit(DocA doca);
	
	void Visit(DocB docb);
}

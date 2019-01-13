import java.util.List;

public class VisitClient {
	public static void main(String[] args) {
		DocBag bags = new DocBag();
		List<Doc> docs = bags.getList();
		
		VisiterA visiter = new VisiterA();
		
		for(Doc doc:docs){
			doc.accept(visiter);
		}
	}
}

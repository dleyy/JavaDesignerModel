package AbsClass;

public class NewsSearch extends BaseSearch{

	@Override
	void storeKey(String key) {
		System.out.println("News key store in data/data/news");
	}

	@Override
	void getHistorySearch() {
		System.out.println("新闻的历史搜索key是：中美合资  美猴王");
	}

	@Override
	String searchMessage(String key) {
		return "This is news searchResult:xxx";
	}
	
}

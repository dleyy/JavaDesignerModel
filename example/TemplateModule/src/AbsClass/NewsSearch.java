package AbsClass;

public class NewsSearch extends BaseSearch{

	@Override
	void storeKey(String key) {
		System.out.println("News key store in data/data/news");
	}

	@Override
	void getHistorySearch() {
		System.out.println("���ŵ���ʷ����key�ǣ���������  ������");
	}

	@Override
	String searchMessage(String key) {
		return "This is news searchResult:xxx";
	}
	
}

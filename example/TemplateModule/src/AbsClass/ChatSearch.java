package AbsClass;

public class ChatSearch extends BaseSearch{

	@Override
	void storeKey(String key) {
		System.out.println("Chat key store in data/data/chat");
	}

	@Override
	void getHistorySearch() {
		System.out.println("�������ʷ����key�ǣ����� �� ����");
	}

	@Override
	String searchMessage(String key) {
		return "This is chat searchResult:xxx";
	}

}

package AbsClass;

public class ChatSearch extends BaseSearch{

	@Override
	void storeKey(String key) {
		System.out.println("Chat key store in data/data/chat");
	}

	@Override
	void getHistorySearch() {
		System.out.println("聊天的历史搜索key是：今天 、 晚上");
	}

	@Override
	String searchMessage(String key) {
		return "This is chat searchResult:xxx";
	}

}

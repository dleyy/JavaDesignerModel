package AbsClass;

public class Test {
	public static void main(String[] args) {
		BaseSearch newsSearch = new NewsSearch();
		BaseSearch chatSearch = new ChatSearch();
		
		newsSearch.doSearch("12");

	}
}

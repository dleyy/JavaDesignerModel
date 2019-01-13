package AbsClass;

abstract class BaseSearch {

	/**
	 * 定义成final 防止子类修改实现步骤
	 */
	public final void doSearch(String key){
		
		String result;
		
		getHistorySearch();
		
		result = searchMessage(key);
		
		storeKey(key);
		
		showResult(result);
	}
	
	// 存储key
	abstract void storeKey(String key);
	
	// 获取历史搜索的key
	abstract void getHistorySearch();
	
	//查询结果
	abstract String searchMessage(String key);
	
	//展示搜索的结果
	public void showResult(String msg){
		System.out.println(msg);
	}
}

package AbsClass;

abstract class BaseSearch {

	/**
	 * �����final ��ֹ�����޸�ʵ�ֲ���
	 */
	public final void doSearch(String key){
		
		String result;
		
		getHistorySearch();
		
		result = searchMessage(key);
		
		storeKey(key);
		
		showResult(result);
	}
	
	// �洢key
	abstract void storeKey(String key);
	
	// ��ȡ��ʷ������key
	abstract void getHistorySearch();
	
	//��ѯ���
	abstract String searchMessage(String key);
	
	//չʾ�����Ľ��
	public void showResult(String msg){
		System.out.println(msg);
	}
}

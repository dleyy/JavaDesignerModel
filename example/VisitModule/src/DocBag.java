import java.util.ArrayList;
import java.util.List;

/**
 * 
 *�ļ������ṹ��������Ԫ��
 */
public class DocBag {
	private List<Doc> docs = new ArrayList<>();
	
	public List<Doc> getList(){
		if(docs.size()==0){
			docs.add(new DocA());
			docs.add(new DocB());
		}
		return docs;
	}

}

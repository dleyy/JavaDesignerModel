import java.util.ArrayList;
import java.util.List;

/**
 * 
 *文件袋：结构对象，容纳元素
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

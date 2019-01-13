import java.util.ArrayList;
import java.util.List;

/**
 * π‹¿Ì¿‡
 *
 */
public class MemntoManager {
	private List<Memento> mementoes = new ArrayList<>();
	
	public void addMemento(Memento memento){
		mementoes.add(memento);
	}
	
	public Memento getMemento(int index){
		return mementoes.get(index);
	}
}

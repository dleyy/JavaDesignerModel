import java.util.HashSet;
import java.util.Set;

import in.Watched;
import in.Watcher;

public class ProductorManager implements Watched {
	
	private Set<Watcher> watchers = new HashSet<>();
	
	@Override
	public void addWatched(Watcher watcher) {
		watchers.add(watcher);
	}

	@Override
	public void removeWatched(Watcher watcher) {
		watchers.remove(watcher);		
	}

	@Override
	public void notifyWatcher() {
		for(Watcher watcher:watchers){
			watcher.update();
		}
	}

}

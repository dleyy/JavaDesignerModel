package in;

public interface Watched {
	
	void addWatched(Watcher watcher);
	
	void removeWatched(Watcher watcher);
	
	void notifyWatcher();
	
}

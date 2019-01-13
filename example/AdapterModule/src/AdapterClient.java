
public class AdapterClient {
	public static void main(String[] args) {
		
		String aviPath = "data/data/vidio/123.avi";
		String mp4Path = "data/data/vidio/123.mp4";
		String mp3Path = "data/data/vidio/123.mp3";
		
		ObjectAdapter adapter = new ObjectAdapter();
		adapter.play(aviPath);
		adapter.play(mp3Path);
		adapter.play(mp4Path);
	}
}


public class Mp3Player implements MusicPlayer {

	@Override
	public void playMp3(String filePath) {
		System.out.println("Music play from " + filePath);
	}

}

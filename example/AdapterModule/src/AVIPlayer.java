
public class AVIPlayer implements VideoPlayer {

	@Override
	public void playMp4(String filePath) {
		System.out.println("do nothing");
	}

	@Override
	public void playAVI(String filePath) {
		System.out.println("Play avi from " + filePath);
	}

}

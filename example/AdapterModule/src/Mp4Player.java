
public class Mp4Player implements VideoPlayer{

	@Override
	public void playMp4(String filePath) {
		System.out.println("Play mp4 from "+filePath);
	}

	@Override
	public void playAVI(String filePath) {
		System.out.println("do nothing");
	}
	
}

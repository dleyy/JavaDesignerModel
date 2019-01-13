
public class ObjectAdapter implements Player {

	private Mp3Player mp3;
	private Mp4Player mp4;
	private AVIPlayer avi;
	
	public ObjectAdapter() {
		mp3 = new Mp3Player();
		mp4 = new Mp4Player();
		avi = new AVIPlayer();
	}
	
	private void playMp4(String filePath) {
		mp4.playMp4(filePath);
	}

	private void playAVI(String filePath) {
		avi.playAVI(filePath);
	}

	private void playMp3(String filePath) {
		mp3.playMp3(filePath);
	}

	@Override
	public void play(String filePath) {
		if(filePath.endsWith(".mp3")){
			playMp3(filePath);
		}else if(filePath.endsWith(".mp4")){
			playMp4(filePath);
		}else if(filePath.endsWith("avi")){
			playAVI(filePath);
		}else{
			System.out.println("不支持的格式");
		}
	}
	
}

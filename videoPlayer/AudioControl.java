package videoPlayer;

public class AudioControl extends Control{
	private boolean volume;

	public AudioControl(boolean volume) {
		super();
		this.volume = volume;
	}

	public boolean isVolume() {
		return volume;
	}

	public void setVolume(boolean volume) {
		this.volume = volume;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		// TODO Auto-generated method stub
		if(volume) {
			if(player.getJacinaZvuka() == 100) {
				player.setJacinaZvuka(player.getJacinaZvuka());
			} else {
				player.setJacinaZvuka(player.getJacinaZvuka() + 1);
			}
		} else {
			if(player.getJacinaZvuka() == 0) {
				player.setJacinaZvuka(player.getJacinaZvuka());
			} else {
				player.setJacinaZvuka(player.getJacinaZvuka() - 1);
			}
		}
		
	}
	
	

}

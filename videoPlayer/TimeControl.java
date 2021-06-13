package videoPlayer;

public class TimeControl extends Control{
	
	private boolean jump;

	public TimeControl(boolean jump) {
		super();
		this.jump = jump;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		// TODO Auto-generated method stub
		if(jump) {
			if((player.getTrenutnoVremeVidea() + 15) > player.getDuzinaVidea()) {
				player.setTrenutnoVremeVidea(player.getDuzinaVidea());
			} else {
				player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() + 15);
			}
		} else {
			if((player.getTrenutnoVremeVidea() - 15) < 0) {
				player.setTrenutnoVremeVidea(0);
			} else {
				player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() - 15);
			}
		}
		
	}

	
	
	

}

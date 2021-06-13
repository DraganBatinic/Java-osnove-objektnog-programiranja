package videoPlayer;

public class QualityOptimizerControl extends Control{
	private int brzinaInterneta;

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}
	
	public int podesavanjeKvaliteta(int brzinaInterneta) {
		int kvalitetZaokruzeni = 0;
		double kvalitet = brzinaInterneta * 10.1;
		if (kvalitet < 144) {
			kvalitetZaokruzeni = 144;
		} else if (kvalitet < 240) {
			kvalitetZaokruzeni = 240;
		} else if (kvalitet < 360) {
			kvalitetZaokruzeni = 360;
		} else if (kvalitet < 480) {
			kvalitetZaokruzeni = 480;
		} else if (kvalitet < 720) {
			kvalitetZaokruzeni = 720;
		} else if (kvalitet < 1080) {
			kvalitetZaokruzeni = 1080;
		}
		
		return kvalitetZaokruzeni;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		// TODO Auto-generated method stub
		player.setKvalitetVidea(podesavanjeKvaliteta(getBrzinaInterneta()));
		
	}
	
	

}

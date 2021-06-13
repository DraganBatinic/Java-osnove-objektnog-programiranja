package apstraktniZadatak8;

public class QualityOptimizerControl extends Control {
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
	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		vp.setKvalitetVidea(this.racunajKvalitet(this.brzinaInterneta));
	}
	public int racunajKvalitet(int brzinaInterneta) {
		double a = brzinaInterneta * 10.1;
		int kvalitet = 0;
		//(144, 240, 360, 480, 720, 1080)
		if(a<=144) {
			kvalitet=144;
		}else if(a<240){
			kvalitet = 240;
		}else if(a<360){
			kvalitet = 360;
		}else if(a<480){
			kvalitet = 480;
		}else if(a<720){
			kvalitet = 720;
		}else {
			kvalitet = 1080;
		}
		return kvalitet;
	}
}
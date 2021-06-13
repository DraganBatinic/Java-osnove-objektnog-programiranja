package apstraktniZadatak8;

public class TimeControl extends Control{
	private boolean unapred;
	public TimeControl(boolean unapred) {
		super();
		this.unapred = unapred;
	}
	public boolean isUnapred() {
		return unapred;
	}
	public void setUnapred(boolean unapred) {
		this.unapred = unapred;
	}
	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if(unapred) {
			if(vp.getTrenutnoVremeVidea()+15>vp.getDuzinaVidea())
				vp.setTrenutnoVremeVidea(vp.getDuzinaVidea());
			else {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea()+15);
			}
		}else {
			if(vp.getTrenutnoVremeVidea()-15<0)
				vp.setTrenutnoVremeVidea(0);
			else {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea()-15);
			}
		}
	}
}
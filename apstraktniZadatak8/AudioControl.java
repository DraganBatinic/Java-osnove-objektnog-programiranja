package apstraktniZadatak8;

public class AudioControl extends Control{
	private boolean pojacaj;
	public AudioControl(boolean pojacaj) {
		super();
		this.pojacaj = pojacaj;
	}
	public boolean isPojacaj() {
		return pojacaj;
	}
	public void setPojacaj(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}
	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if(pojacaj) {
			if(vp.getJacinaZvuka()<100) {
			vp.setJacinaZvuka(vp.getJacinaZvuka()+1);
			}
		}else {
			if(vp.getJacinaZvuka()>0) {
				vp.setJacinaZvuka(vp.getJacinaZvuka()-1);
			}
		}
	}
}
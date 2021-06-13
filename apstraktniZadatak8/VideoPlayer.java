package apstraktniZadatak8;

public class VideoPlayer {
	private double duzinaVidea;
	private double trenutnoVremeVidea;
	private int jacinaZvuka;
	private int kvalitetVidea;
	public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}
	public double getDuzinaVidea() {
		return duzinaVidea;
	}
	public void setDuzinaVidea(double duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	public double getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}
	public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int getKvalitetVidea() {
		return kvalitetVidea;
	}
	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	public void stampaj() {
		System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea + " sekundi");
		System.out.println("Jacina zvuka: " + this.jacinaZvuka);
		System.out.println("Kvalite videa: " + this.kvalitetVidea);
	}
}
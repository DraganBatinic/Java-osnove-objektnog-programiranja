package banka;

public class VisaKartica extends PlatnaKartica{
	private String ovlascenoLice;

	public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
		super(suma, brojKartice, godina, mesec);
		this.ovlascenoLice = ovlascenoLice;
	}

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}
	
	public void izvrsiVisaTransakciju(double skinutaSvota) {
		if ((skinutaSvota / 100 * 1.8) > 4) {
		super.izvrsiTransakciju(skinutaSvota + (skinutaSvota / 100 * 1.8));
		} else {
			super.izvrsiTransakciju(skinutaSvota + 4);
		}	
	}
	
	public void stampaOVisaKartici() {
		System.out.print("Visa Card: ");
		super.stampaOKartici();
	}

}

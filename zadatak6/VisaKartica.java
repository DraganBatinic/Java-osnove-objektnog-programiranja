package zadatak6;

public class VisaKartica extends PlatnaKartica{
	private String ovlascenoLice;

	public VisaKartica(double suma, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartice,
			String ovlascenoLice) {
		super(suma, brojKartice, godinaVazenjaKartice, mesecVazenjaKartice);
		this.ovlascenoLice = ovlascenoLice;
	}

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}	
	
	public void transakcijaVisa(double trosak) {
		double sumaZaSkidanje = trosak / 100 * 1.8;
		if (trosak >= 4) {
			super.izvrsiTransakciju(trosak + sumaZaSkidanje);
		} else if (trosak < 4) {
			super.izvrsiTransakciju(trosak +4);
		}
	}
	
	public void stampaOVisaKartici () {
		System.out.println("Visa Card: " + super.getMesecVazenjaKartice() + "/" + super.getGodinaVazenjaKartice() +
				", " + super.getBrojKartice() + ", $" + super.getSuma());
	}

}

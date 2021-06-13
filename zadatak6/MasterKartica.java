package zadatak6;

public class MasterKartica extends PlatnaKartica{

	public MasterKartica(double suma, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartice) {
		super(suma, brojKartice, godinaVazenjaKartice, mesecVazenjaKartice);
		
	}
	
	public void transakcijaMaster(double trosak) {
		double sumaZaSkidanje = trosak / 100 * 1.5;
		super.izvrsiTransakciju(trosak + sumaZaSkidanje);
	}
	
	public void odrzavanje() {
		super.izvrsiTransakciju(2);
	}
	
	public void stampaOMasterKartici () {
		System.out.println("Master Card: " + super.getMesecVazenjaKartice() + "/" + super.getGodinaVazenjaKartice() +
				", " + super.getBrojKartice() + ", $" + super.getSuma());
	}
	
	

}

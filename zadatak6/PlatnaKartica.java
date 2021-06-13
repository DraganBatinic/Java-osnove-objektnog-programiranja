package zadatak6;

public class PlatnaKartica {
	private double suma;
	private String brojKartice;
	private int godinaVazenjaKartice;
	private int mesecVazenjaKartice;
	public PlatnaKartica(double suma, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartice) {		
		this.suma = suma;
		this.brojKartice = brojKartice;
		this.godinaVazenjaKartice = godinaVazenjaKartice;
		this.mesecVazenjaKartice = mesecVazenjaKartice;
	}
	public double getSuma() {
		return suma;
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public int getGodinaVazenjaKartice() {
		return godinaVazenjaKartice;
	}
	public int getMesecVazenjaKartice() {
		return mesecVazenjaKartice;
	}
	
	public void dodajSredstva (double dodataSuma) {
		this.suma += dodataSuma;
	}
	
	public void izvrsiTransakciju (double skinutaSuma) {
		this.suma -= skinutaSuma;
	}
	
	public void stampaOKartici() {
		System.out.println(this.brojKartice + ", " + this.mesecVazenjaKartice + "/" + this.godinaVazenjaKartice + ", $ " + this.suma);
	}
	
	

}

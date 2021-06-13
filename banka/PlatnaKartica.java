package banka;

public class PlatnaKartica {
	private double suma;
	private String brojKartice;
	private int godina;
	private int mesec;
	
	public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
		super();
		this.suma = suma;
		this.brojKartice = brojKartice;
		this.godina = godina;
		this.mesec = mesec;
	}

	public double getSuma() {
		return suma;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public int getGodina() {
		return godina;
	}

	public int getMesec() {
		return mesec;
	}
	
	public void dodajSredstva(double dodataSvota) {
		this.suma += dodataSvota;
	}
	
	public void izvrsiTransakciju(double skinutaSvota) {
		this.suma -= skinutaSvota;
	}
	
	public void stampaOKartici() {
		System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
	}
	

}

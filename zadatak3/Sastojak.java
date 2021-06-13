package zadatak3;

public class Sastojak {
	private String naziv;
	private double cena;
	
	public Sastojak(String naziv, double cena) {		
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}
	
	public void stampanjeSastjka() {
		System.out.println(this.naziv + " - " + this.cena + " din.");
	}
	
	
		

}

package domaci1105;

public class Racun {

	private String brRacuna;
	private double stanje;

	public Racun(String brojRacuna) {
		this.brRacuna = brojRacuna;
		this.stanje = 0;
	}

	public String getBrojRacuna() {
		return this.brRacuna;
	}

	public void setStanje(double novoStanje) {
		this.stanje = novoStanje;
	}

	public double getStanje() {
		return this.stanje;
	}

	public void dodavanjeNovcaNaRacun(double uplata) {
		this.stanje += uplata;
	}

	public void skidanjeNovcaSaRacuna(double isplata) {
		this.stanje -= isplata;
	}

}

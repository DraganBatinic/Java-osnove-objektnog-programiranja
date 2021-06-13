package vezbaZaTest;
/*Napraviti klasu Sastojak koja ima:
Atribute: 
Naziv
Kolicina u gramima
Cena po gramu
Konstrukrore, gettere i settere
Metodu cena sastojaka (vraca cenu sastojka koja se racuna po formuli kolicina u gr * cana po gr)
Metodu stampaj koja vrsi ispis u formatu naziv sastojak, cena sastojka
Primer ispisa:
limun, cena: 30.0 din*/

public class Sastojak {
	private String naziv;
	private int kolicinaUGramima;
	private double cenaPoGramu;
	
	public Sastojak(String naziv, int kolicinaUGramima, double cenaPoGramu) {
		super();
		this.naziv = naziv;
		this.kolicinaUGramima = kolicinaUGramima;
		this.cenaPoGramu = cenaPoGramu;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getKolicinaUGramima() {
		return kolicinaUGramima;
	}

	public void setKolicinaUGramima(int kolicinaUGramima) {
		this.kolicinaUGramima = kolicinaUGramima;
	}

	public double getCenaPoGramu() {
		return cenaPoGramu;
	}

	public void setCenaPoGramu(double cenaPoGramu) {
		this.cenaPoGramu = cenaPoGramu;
	}
	
	public double cenaSastojaka() {
		double cenaSastojka = this.kolicinaUGramima * this.cenaPoGramu;
		return cenaSastojka;		
	}
	
	public void stampaOSastojku() {
		System.out.println(this.naziv + ", cena: " + this.cenaSastojaka() + " din");
	}
	
	
	
	
	

}

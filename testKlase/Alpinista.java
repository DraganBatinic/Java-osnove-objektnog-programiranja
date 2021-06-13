package testKlase; 
/*(20 poena) Kreirati klasu ?Alpinista ?koja nasle?uje klasu Planinar. 
 * Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) 
 * i poeni se mogu menjati (znaci, postojace seter). Napraviti konstruktor. 
 * Alpinista može da savlada sve uspone do 4000 metara, 
 * placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, 
 * a informacije o alpinisti se ispisuju u formatu: 
Alpinista, id: id
ime: ime i prezime 
Broj poena: poeni */

public class Alpinista extends Planinar{
	private int brojPoena;

	public Alpinista(int identifikacioniBroj, String imeIPrezime, int brojPoena) {
		super(identifikacioniBroj, imeIPrezime);
		this.brojPoena = brojPoena;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Alpinista, id: " + super.getIdentifikacioniBroj());
		System.out.println("Ime: " + super.getImeIPrezime());
		System.out.println("Broj poena: " + this.brojPoena);
		
	}

	@Override
	public int clanarinaPlaninara() {
		// TODO Auto-generated method stub
		if ((1500 - this.brojPoena*50) >= 0) {
			return 1500 - (this.brojPoena * 50);
		} else {
			return 0;
		}
		
		
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		// TODO Auto-generated method stub
		if (planina.getVisinaPlanine() <= 4000) {
			return true;
		} else {
			return false;
		}
	}
	
	

}

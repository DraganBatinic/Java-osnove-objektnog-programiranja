package testKlase;
/*? jedinstveni celobrojni identifikacioni broj
? ime i prezime 
Dok od javnih metoda: 
? konstruktor koji postavlja sve atribute klase. 
? gettere 
? apstraktnu metodu štampaj
? apstraktnu metodu koja vraca clanarinu planinara
? apstraktnu metodu uspesanUspon koja ?vra?a ?informaciju da li ?e se planinar upešno popeti na planinu. 
Metoda kao ulazni parametar prima objekat tipa Planina. */

public abstract class Planinar {
	private int identifikacioniBroj;
	private String imeIPrezime;
	
	public Planinar(int identifikacioniBroj, String imeIPrezime) {		
		this.identifikacioniBroj = identifikacioniBroj;
		this.imeIPrezime = imeIPrezime;
	}

	public int getIdentifikacioniBroj() {
		return identifikacioniBroj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	
	
	public abstract void stampaj();
	
	public abstract int clanarinaPlaninara();
	
	public abstract boolean uspesanUspon(Planina planina);
	
	

}

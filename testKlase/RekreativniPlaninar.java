package testKlase;
/*Kreirati klasu ?RekreativniPlaninar? koja nasle?uje klasu Planinar. 
 * Klasa dodatno pamti još neke informacije koje se ne mogu menjati 
 * nakon postavljanja u konstuktoru (znaci, nemaju setere): 
? teinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
? naziv okruga odakle je rekreativni planinar. 
? maksimalni uspon koji planinar moe da savlada bez opreme (npr: 2000m)
? napraviti konstruktor
? da li ?e rekreativni planinar uspešno popeti na planinu 
zavisi da li je njegov najve?i uspon manji od visine planine, 
s tim da oprema dodatno oteava penjanje i za svaki kilogram opreme 
koji nosi moe da pre?e 50 metara manje. 
? rekeativci placaju clanarinu u iznosu od 1000 rsd
? metoda koja ispisuje podatke o planinaru ispisuje ih u slede?em formatu: 
Rekreativac, id: id
 ime: ime prezime Okrug: okrug */

public class RekreativniPlaninar extends Planinar{
	private int tezinaOpreme;
	private String nazivOkruga;
	private int maksUsponBezOpreme;
	
	public RekreativniPlaninar(int identifikacioniBroj, String imeIPrezime, int tezinaOpreme, String nazivOkruga,
			int maksUsponBezOpreme) {
		super(identifikacioniBroj, imeIPrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maksUsponBezOpreme = maksUsponBezOpreme;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaksUsponBezOpreme() {
		return maksUsponBezOpreme;
	}

	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Rekreativac, id: " + super.getIdentifikacioniBroj());
		System.out.println("Ime: " + super.getImeIPrezime());
		System.out.println("Okrug: " + this.nazivOkruga);
		
	}

	@Override
	public int clanarinaPlaninara() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		// TODO Auto-generated method stub
		if((this.maksUsponBezOpreme - (this.tezinaOpreme * 50)) >= planina.getVisinaPlanine()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	

}

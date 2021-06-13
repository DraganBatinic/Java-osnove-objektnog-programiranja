package domaci1805;

public class AutobusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vozac v1 = new Vozac("Petar Petrovic", "vozac");
		Vozac v2 = new Vozac("Marko Markovic", "visi vozac");
		
		Putnik p1 = new Putnik("Mara Maric", 1000);
		Putnik p2 = new Putnik("Zora Zoric", 1520);
		Putnik p3 = new Putnik("Rade Radic", 854);
		Putnik p4 = new Putnik("Mile Milic", 3150);
		Putnik p5 = new Putnik("Joka Jokic", 2100);
		
		Autobus a1 = new Autobus("Novi Sad - Beograd", 700);
		
		a1.postaviVozaca(v1);
		a1.dodajPutnika(p1);
		a1.dodajPutnika(p2);
		a1.dodajPutnika(p3);
		a1.dodajPutnika(p4);
		a1.dodajPutnika(p5);
		
		System.out.println("Autobus na relaciji: " + a1.getNaziv() + " vozi " + a1.getVozac().getImeIPrezime() + ", a cena karte je: " + a1.getCenaKarte() + " dinara");
		System.out.println("");
		System.out.println("Lista putnika koju putuju autobusom: ");
		for (int i = 0; i < a1.getListaPutnika().size(); i++) {
			a1.getListaPutnika().get(i).oduzmiNovac(a1.getCenaKarte());
			System.out.println(a1.getListaPutnika().get(i).getImeIPrezime() + ", a preostala svota novca je " + a1.getListaPutnika().get(i).getSvotaNovca());								
		}
		

	}

}

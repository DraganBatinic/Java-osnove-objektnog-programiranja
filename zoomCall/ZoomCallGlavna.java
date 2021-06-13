package zoomCall;

public class ZoomCallGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korisnik k1 = new Korisnik("Dragan Batinic");
		Korisnik k2 = new Korisnik("Marija Batinic");
		
		k1.pretplatiSe(150);
		k2.pretplatiSe(100);
		
		k1.stampaKorisnika();
		k2.stampaKorisnika();
		System.out.println("--------------------------");
		
		ZoomCall zc1 = new ZoomCall("www.link.com", "12345", k1, k2);
		
		zc1.pokreniPoziv();
		System.out.println("------------------------------------");
		
		k1.ponistiPretplatu();
		zc1.pokreniPoziv();
		

	}

}

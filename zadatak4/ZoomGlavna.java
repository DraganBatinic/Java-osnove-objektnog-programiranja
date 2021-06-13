package zadatak4;

public class ZoomGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korisnik dragan = new Korisnik("Dragan Batinic", "basic");
		Korisnik marija = new Korisnik("Marija Batinic", "basic");
		Korisnik uros = new Korisnik("Uros Batinic", "basic");
		
		dragan.stampaKorisnika();
		
		dragan.pretplatiSe(100);
		uros.pretplatiSe(150);
		
		ZoomCall draganovPoziv = new ZoomCall("www.poziv.rs", "12345", dragan, uros);
		
		draganovPoziv.pokreniPoziv();
		
		dragan.ponistiPretplatu();
		
		System.out.println("");
		draganovPoziv.pokreniPoziv();
		
		
				

	}

}

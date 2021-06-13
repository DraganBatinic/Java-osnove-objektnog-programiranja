package automobili;

public class AutomobiliGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iz AutomobilGlavna klase instancirajete 
		//nekoliko objekata klase automobil i odstampajte podatke 
		//o njima pozivajuci metodu za stampanje te klase
		
		 //iz glavne klase ispisite model automobila i koliko trosi za svaki objekat
		
		
		Automobil automobil1 = new Automobil("Seat", "Ibiza", "Benzin/gas", 3, 2001);
		automobil1.setPotrosnja();
		Automobil automobil2 = new Automobil("Yugo", "Koral", "Benzin/gas", 3, 1998);
		automobil2.setPotrosnja();
		Automobil automobil3 = new Automobil("Ford", "Fiesta", "Benzin/gas", 3, 1996);
		automobil3.setPotrosnja();
		Automobil automobil4 = new Automobil("Citroen", "C3", "Benzin/gas", 5, 2015);
		automobil4.setPotrosnja();
		Automobil automobil5 = new Automobil();
		automobil5.marka = "Fiat";
		automobil5.model = "Punto";
		automobil5.pogonskoGorivo = "Bezin";
		automobil5.brojVrata = 5;
		automobil5.godinaProizvodnje = 2000;
		automobil5.setPotrosnja();
		
		System.out.println(automobil1.model + " na 100 km trosi " + automobil1.getPotrosnja() + " litara.");
		System.out.println(automobil2.model + " na 100 km trosi " + automobil2.getPotrosnja() + " litara.");
		System.out.println(automobil3.model + " na 100 km trosi " + automobil3.getPotrosnja() + " litara.");
		System.out.println(automobil4.model + " na 100 km trosi " + automobil4.getPotrosnja() + " litara.");
		System.out.println(automobil5.model + " na 100 km trosi " + automobil5.getPotrosnja() + " litara.");
		
		
		automobil1.stampaPodatakaOAutomobilu();
		automobil2.stampaPodatakaOAutomobilu();
		automobil3.stampaPodatakaOAutomobilu();
		automobil4.stampaPodatakaOAutomobilu();
		automobil5.stampaPodatakaOAutomobilu();
	}

}

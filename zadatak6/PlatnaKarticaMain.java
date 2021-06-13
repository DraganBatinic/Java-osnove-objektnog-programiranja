package zadatak6;

public class PlatnaKarticaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlatnaKartica pk1 = new PlatnaKartica(1000, "4012-1239-1221-3381", 2019, 11);
		VisaKartica vk1 = new VisaKartica(pk1.getSuma(), pk1.getBrojKartice(), pk1.getGodinaVazenjaKartice(), pk1.getMesecVazenjaKartice(), "Marko Markovic");
		MasterKartica mk1 = new MasterKartica(pk1.getSuma(), pk1.getBrojKartice(), pk1.getGodinaVazenjaKartice(), pk1.getMesecVazenjaKartice());
		
		pk1.stampaOKartici();
		pk1.izvrsiTransakciju(10);
		pk1.stampaOKartici();
		pk1.dodajSredstva(6.3);
		pk1.stampaOKartici();
		System.out.println("------------------------");
		vk1.transakcijaVisa(569);;
		vk1.stampaOVisaKartici();
		System.out.println("------------------------");
		mk1.transakcijaMaster(45);
		mk1.stampaOMasterKartici();

	}

}
	
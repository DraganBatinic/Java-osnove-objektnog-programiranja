package poreskaUprava;

public class PoreskaravaGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoreskaUprava pu1 = new PoreskaUprava("Palanka");
		Kuca k1 = new Kuca("Privrednikova 5", 123.65, 2, 5);
		Kuca k2 = new Kuca("Vetrova 2", 100, 3, 3);
		Kuca k3 = new Kuca("Vrbina 1", 77.98, 1, 5);
		
		Zgrada z1 = new Zgrada("Jovina 3", 654.23, 3, 8);
		Zgrada z2 = new Zgrada("Perina 10", 353.23, 2, 5);
		Zgrada z3 = new Zgrada("Morkina 12", 1023, 1, 12);
		
		Lokal l1 = new Lokal("Mirina 2", 56.32, 1);
		Lokal l2 = new Lokal("Lastina 34", 77.32, 3);
		Lokal l3 = new Lokal("Meseceva 12", 44.56, 2);
		
		pu1.dodajObjekat(k1);
		pu1.dodajObjekat(k2);
		pu1.dodajObjekat(k3);
		pu1.dodajObjekat(z1);
		pu1.dodajObjekat(z2);
		pu1.dodajObjekat(z3);
		pu1.dodajObjekat(l1);
		pu1.dodajObjekat(l2);
		pu1.dodajObjekat(l3);
		
		pu1.stampaSvihObjekata();
		pu1.objekatSaNajmanjimPorezom().stampaj();
		System.out.println("--------------------------------------");
		pu1.objekatSaNajvecimPorezom().stampaj();
		System.out.println("--------------------------------------");
		System.out.println("Ukupan porez za ceo grad je: " + pu1.porezZaCeoGrad());
		

	}

}

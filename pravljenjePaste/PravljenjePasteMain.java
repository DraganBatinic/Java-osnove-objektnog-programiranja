package pravljenjePaste;
//U glavnom programu kreirati objekte i testirati funkcionalnosti */

public class PravljenjePasteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sastojak spagete = new Sastojak("Spagete", 100);
		Sastojak sir = new Sastojak("Mocarela sir", 250);
		Sastojak paradajzSos = new Sastojak("Paradajz sos", 175);
		Sastojak juneceMeso = new Sastojak("Junece meso", 450);
		Sastojak majonez = new Sastojak("Majonez", 80);
		
		Pasta spageteBolonjeze = new Pasta();
		spageteBolonjeze.dodavanjeSastojka(spagete);
		spageteBolonjeze.dodavanjeSastojka(sir);
		spageteBolonjeze.dodavanjeSastojka(paradajzSos);
		spageteBolonjeze.dodavanjeSastojka(juneceMeso);
		spageteBolonjeze.dodavanjeSastojka(majonez);
		
		System.out.println("");
		spageteBolonjeze.stampaOPasti();
		
		System.out.println("");
		spageteBolonjeze.brisanjeSastojka("Majonez");
		
		System.out.println("");
		spageteBolonjeze.stampaOPasti();
		
		

	}

}

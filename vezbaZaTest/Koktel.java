package vezbaZaTest;
/*Napraviti klasu Koktel koja nasledjuje Pice koja ima
Konstrukrore, gettere i settere
Metodu koja racuna cenuPica po formuli 1.9 *  cena svih sastojaka
Metodu stampaj koja stampa ukupnu cenu koktela i sve sastojke sa cenama sastojaka
Primer ispisa:
Koktel: mojito, cena:114.0 din
Sastojci: 
limun, cena: 30.0 din
menta, cena: 20.0 din
votka, cena: 10.0 din*/

import java.util.ArrayList;

public class Koktel extends Pice{

	public Koktel(String naziv, ArrayList<Sastojak> listaSastojaka) {
		super(naziv, listaSastojaka);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cenaPica() {
		// TODO Auto-generated method stub
		double cenaKoktela = super.cenaSvihSastojaka() * 1.9;
		return cenaKoktela;
	}

	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Koktel: " + super.getNaziv() + ", cena: " + cenaPica() + " din");
		System.out.println("Sastojci: ");
		for (int i = 0; i < super.getListaSastojaka().size(); i++) {
			super.getListaSastojaka().get(i).stampaOSastojku();
		}
	}
	
	

}

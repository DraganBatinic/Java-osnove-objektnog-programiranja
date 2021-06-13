package vezbaZaTest;
/*Napraviti klasu Kafa koja nasledjuje Pice koja ima
Atribute: 
Procenat kofeina
Konstrukrore, gettere i settere
Metodu koja racuna cenuPica po formuli (procenat kofeina * 30) + cena svih sastojaka
Metodu stampaj koja stampa ukupnu cenu kafe i sve sastojke sa cenama sastojaka
Primer ispisa:
Mocha, procenat kofeina: 1%, cena: 150.0 din
Sastojci: 
Mleko, cena: 50.0 din
Slag, cena: 70.0 din*/

import java.util.ArrayList;

public class Kafa extends Pice{
	private int procenatKofeina;

	public Kafa(String naziv, ArrayList<Sastojak> listaSastojaka, int procenatKofeina) {
		super(naziv, listaSastojaka);
		this.procenatKofeina = procenatKofeina;
	}

	public int getProcenatKofeina() {
		return procenatKofeina;
	}

	public void setProcenatKofeina(int procenatKofeina) {
		this.procenatKofeina = procenatKofeina;
	}

	@Override
	public double cenaPica() {
		// TODO Auto-generated method stub
		double cenaPica = cenaSvihSastojaka() + (this.procenatKofeina * 30);
		return cenaPica;		
	}

	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println(super.getNaziv() + ", procenat kofeina: " + this.procenatKofeina + "% , cena: " + cenaPica() + " din");
		System.out.println("Sastojci: ");
		for (int i = 0; i < super.getListaSastojaka().size(); i++) {
			super.getListaSastojaka().get(i).stampaOSastojku();
		}
	}
	
	

}

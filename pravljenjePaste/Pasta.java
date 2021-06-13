package pravljenjePaste;

import java.util.ArrayList;

//●	listu  sastojaka
//●	metodu za dodavanje sastojka
//●	metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//●	defaultni konstruktor
//●	metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//●	metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din

public class Pasta {
	private ArrayList<Sastojak> sastojci;
	
	public Pasta(){
		this.sastojci = new ArrayList<Sastojak>();
	}
	
	public void dodavanjeSastojka(Sastojak sastojci) {
		this.sastojci.add(sastojci);		
	}
	
	public void brisanjeSastojka(String sastojak) {
		for (int i = 0; i < this.sastojci.size(); i++) {
			if(this.sastojci.get(i).getNaziv().equals(sastojak)) {
				this.sastojci.remove(i);
			}
		}
	}
	
	public double cenaPaste() {
		double ukupnaCena = 0;
		for (int i = 0; i < this.sastojci.size(); i++) {
			ukupnaCena += this.sastojci.get(i).getCena();
		}
		
		return ukupnaCena;
	}
	
	public void stampaOPasti() {
		System.out.println("Pasta je sa satojcima:");
		for (int i = 0; i < this.sastojci.size(); i++) {
			System.out.println(this.sastojci.get(i).getNaziv() + " - " + this.sastojci.get(i).getCena() + " din.");
		}
		System.out.println("Cena paste je: " + cenaPaste());
	}

}

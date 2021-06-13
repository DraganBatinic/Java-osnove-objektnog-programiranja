package zadatak3;

import java.util.ArrayList;

public class Pasta {
	private ArrayList<Sastojak> listaSastojaka;
	

	public Pasta() {
		super();
		listaSastojaka = new ArrayList<Sastojak>();
	}
	
	public void dodavanjeSastojaka(Sastojak primljeniSastojak) {
		this.listaSastojaka.add(primljeniSastojak);
	}
	
	public void brisanjeSastojaka(String nazivSastojka) {
		for (int i = 0; i < this.listaSastojaka.size(); i++) {
			if(this.listaSastojaka.get(i).getNaziv().equals(nazivSastojka)) {
				listaSastojaka.remove(i);
			}
		}
	}
	
	public double sabiranjeCena() {
		double cenaPaste = 0;
		for (int i = 0; i < this.listaSastojaka.size(); i++) {
			cenaPaste += listaSastojaka.get(i).getCena();
		}
		
		return cenaPaste;
	}
	
	public void stampanjePodatakaOPasti() {
		System.out.println("Pasta je sa sastojcima");
		for (int i = 0; i < listaSastojaka.size(); i++) {
			listaSastojaka.get(i).stampanjeSastjka();
		}
		System.out.println("Cena paste je " + sabiranjeCena() + " din.");
	} 
	
	
	

}

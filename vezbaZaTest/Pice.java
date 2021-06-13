package vezbaZaTest;

import java.util.ArrayList;

/*Napraviti apstraktnu klasu Pice koja ima:
Atribute: 
* naziv, 
* listu sastojaka (predstavlja listu svih sastojaka pica npr. Mohito ima limunadu, mentu i votku)
Konstrukrore, gettere i settere
Metodu dodaj sastojak (parametar prima sastojak i dodaje ga u listu sastojaka)
Metodu cena svih sastojaka koja vraca  zbir cena svih sastojaka iz liste sastojaka
Apstraktnu metodu cenaPica 
Apstraktnu metodu stampaj*/

public abstract class Pice {
	private String naziv;
	private ArrayList<Sastojak> listaSastojaka;
	
	public Pice(String naziv, ArrayList<Sastojak> listaSastojaka) {
		super();
		this.naziv = naziv;
		this.listaSastojaka = new ArrayList<Sastojak>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public ArrayList<Sastojak> getListaSastojaka() {
		return listaSastojaka;
	}

	public void setListaSastojaka(ArrayList<Sastojak> listaSastojaka) {
		this.listaSastojaka = listaSastojaka;
	}
	
	public void dodajSastojak(Sastojak noviSastojak) {
		listaSastojaka.add(noviSastojak);
	}
	
	public double cenaSvihSastojaka() {
		double zbirCena = 0;
		for (int i = 0; i < this.listaSastojaka.size(); i++) {
			zbirCena += this.listaSastojaka.get(i).cenaSastojaka();	
		}
		return zbirCena;
	}
	
	public abstract double cenaPica();
	
	public abstract void stampaj();
	
	

}

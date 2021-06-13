package domaci1805;

import java.util.ArrayList;

public class Autobus {
	private String naziv;
	private Vozac vozac;
	private int cenaKarte;
	private ArrayList<Putnik> listaPutnika;
	
	public Autobus(String naziv, int cenaKarte) {		
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.listaPutnika = new ArrayList<Putnik>();
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public ArrayList<Putnik> getListaPutnika() {
		return listaPutnika;
	}

	public void setListaPutnika(ArrayList<Putnik> listaPutnika) {
		this.listaPutnika = listaPutnika;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}
	
	public void postaviVozaca (Vozac vozac) {
		setVozac(vozac);
	}
	
	public void ukloniVozaca () {
		setVozac(null);
	}
	
	public void dodajPutnika(Putnik noviPutnik) {
		this.listaPutnika.add(noviPutnik);
	}
	
	public void ukloniPutnika(Putnik uklonjenPutnik) {
		this.listaPutnika.remove(uklonjenPutnik);
	}
	
	
	

}

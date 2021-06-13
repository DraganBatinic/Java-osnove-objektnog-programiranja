package domaci1705;

import java.util.ArrayList;

public class Klub {
	private String naziv;
	private String sediste;
	private int godinaOsnivanja;
	private ArrayList<Sportista> listaSportista;
	
	public Klub(String naziv, String sediste, int godinaOsnivanja) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		this.godinaOsnivanja = godinaOsnivanja;
		this.listaSportista = new ArrayList<Sportista>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public ArrayList<Sportista> getListaSportista() {
		return listaSportista;
	}
	
	public void dodavanjeSportiste(Sportista noviSportista) {
		listaSportista.add(noviSportista);
	}
	
	public void uklanjanjeSportiste(String ime, String prezime) {
		for (int i = 0; i < listaSportista.size(); i++) {
			if (listaSportista.get(i).getIme().equals(ime) && listaSportista.get(i).getPrezime().equals(prezime)) {
				listaSportista.remove(i);
			}
		}
	}
	
	//nema u zadatku ali sam dodao samoinicijativno metodu za ispis sportista u klubu
	public void stampaSportistaUKlubu() {
		System.out.println("Sportisti koji se takmice za klub " + this.naziv + " su:");
		for (int i = 0; i < listaSportista.size(); i++) {
			listaSportista.get(i).stampaOSportisti();
		}
	}
	
	

}

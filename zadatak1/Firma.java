package zadatak1;

import java.util.ArrayList;

public class Firma {
	private String naziv;
	private String oblastPoslovanja;
	private int godinaOsnivanja;
	private ArrayList<Radnik> radnici;
	
	public Firma(String naziv, String oblastposlovanja, int godinaOsnivanja) {
		this.naziv = naziv;
		this.oblastPoslovanja = oblastposlovanja;
		this.godinaOsnivanja = godinaOsnivanja;
		this.radnici = new ArrayList<Radnik>();
	}
	
	public Firma(String oblastPoslovanja) {
		this.oblastPoslovanja = oblastPoslovanja;
		this.radnici = new ArrayList<Radnik>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void setGodinaOsnivanja(int godinaOsnivanja) {
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getOblastPoslovanja() {
		return oblastPoslovanja;
	}
	
	public void stampajOFirmi() {
		System.out.println("Nasa firma se zove " + this.naziv + " i bavimo se " + this.oblastPoslovanja + " a osnovani smo" + this.godinaOsnivanja);
	}
	
	public void zaposljavanjeRadnika(Radnik zaposlen) {
		radnici.add(zaposlen);
	}
	public void ispisPodatakaOZaposlenima() {
		if(radnici.size() == 0) {
			System.out.println("Firma " + this.naziv + " nema ni jednog zaposlenog");
		}else {
			System.out.println("U " + this.naziv + " rade:");
			for (int i = 0; i < radnici.size(); i++) {
				radnici.get(i).ispisPodatakaORadniku();
			}
		}
	}
	

}

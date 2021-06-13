package radnik;

import java.util.ArrayList;

public class Firma {
	private String naziv;
	private String oblastPoslovanja;
	private int godinaOsnivanja;
	private ArrayList<Radnik> radnici;
	
	public Firma(String naziv, String oblastPoslovanja, int godinaOsnivanja, ArrayList<Radnik> radnici ) {		
		this.naziv = naziv;
		this.oblastPoslovanja = oblastPoslovanja;
		this.godinaOsnivanja = godinaOsnivanja;
		this.radnici = new ArrayList<Radnik>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOblastPoslovanja() {
		return oblastPoslovanja;
	}

	public void setOblastPoslovanja(String oblastPoslovanja) {
		this.oblastPoslovanja = oblastPoslovanja;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void setGodinaOsnivanja(int godinaOsnivanja) {
		this.godinaOsnivanja = godinaOsnivanja;
	}
	
	public void dodavanjeRadnika(Radnik noviRadnik) {
		this.radnici.add(noviRadnik);
	}
	
	public void ispisORadnicimaFirme() {
		if (radnici.size() > 0) {
			System.out.println("U firmi " + this.naziv + " su zaposleni sledeci radnici:");
			for (int i = 0; i < radnici.size(); i++) {
				System.out.println(radnici.get(i).getImeIPrezime());
			}
		} else {
			System.out.println("U firmi " + this.naziv + " nema zaposlenih radnika.");
		}
	
	}

}

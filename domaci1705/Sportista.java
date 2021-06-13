package domaci1705;

public class Sportista {
	private String ime;
	private String prezime;
	private int godinaRodjenja;
	
	public Sportista(String ime, String prezime, int godinaRodjenja) {		
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
	
	public void stampaOSportisti() {		
		System.out.println(this.ime.toUpperCase() + "_" + this.prezime.toUpperCase() + ":" + this.godinaRodjenja);
	}
	
	

}

package atletika;
/** ime i prezime privatni
* i rezultat ostvaren na takmičenju koji je zasticen
Javne metode klase su: 
* apstratktna metoda koja ispituje da li je rezultat atletičara 
* bolji od rezultata drugog atletičara 
* (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
* metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)*/

public abstract class Atleticar {
	private String ime;
	private String prezime;
	private double rezultat;	
	
	public Atleticar(String ime, String prezime, double rezultat) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.rezultat = rezultat;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getRezultat() {
		return rezultat;
	}

	public abstract boolean uporedjivanjeAtleticara(Atleticar atleticar);
	
	public void stampaOAtleticaru() {
		System.out.println("(" + this.ime + ") (" + this.prezime + "), (" + this.rezultat + ")");
	}

}

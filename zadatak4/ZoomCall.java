package zadatak4;

public class ZoomCall {
	private String linkZaPoziv;
	private String password;
	private Korisnik korisnikHost;
	private Korisnik korisnikGuest;
	
	public ZoomCall(String linkZaPoziv, String password, Korisnik korisnikHost, Korisnik korisnikGuest) {		
		this.linkZaPoziv = linkZaPoziv;
		this.password = password;
		this.korisnikHost = korisnikHost;
		this.korisnikGuest = korisnikGuest;
	}

	public Korisnik getKorisnikGuest() {
		return korisnikGuest;
	}

	public void setKorisnikGuest(Korisnik korisnikGuest) {
		this.korisnikGuest = korisnikGuest;
	}

	public String getLinkZaPoziv() {
		return linkZaPoziv;
	}

	public String getPassword() {
		return password;
	}

	public Korisnik getKorisnikHost() {
		return korisnikHost;
	}
	
	public void pokreniPoziv () {
		System.out.println("Zoom call: " + this.linkZaPoziv);
		System.out.println("Password: " + this.password);
		System.out.print("Host: " );
		this.korisnikHost.stampaKorisnika();
		System.out.print("Guest: ");
		this.korisnikGuest.stampaKorisnika();
		System.out.println("Maksimalno trajanje poziva je: " + this.korisnikHost.maksimalnoTrajanjeVideoPoziva() + " minuta.");
		
	}
	

}

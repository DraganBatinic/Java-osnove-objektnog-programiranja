package zadatak1;

public class Radnik {
	private String jmbg;
	private String ime;
	private String prezime;
	private int brojDece;
	private int stepenStrucneSpreme;
	private int godineRadnogStaza;
	
	public Radnik (String jmbg, String ime, String prezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza) {
		this.jmbg = jmbg;
		this.ime = ime;
		this.prezime = prezime;
		this.brojDece = brojDece;
		this.stepenStrucneSpreme = stepenStrucneSpreme;
		this.godineRadnogStaza = godineRadnogStaza;
	}
	
	public void setIme (String promenaImena) {
		this.ime = promenaImena;
	}
	
	public void setPrezime (String promenaPrezimena) {
		this.prezime = promenaPrezimena;
	}
	
	public void setBrojDece (int promenaBrojaDece) {
		this.brojDece = promenaBrojaDece;
	}
	
	public void setSSS (int promenaSSS) {
		this.stepenStrucneSpreme = promenaSSS;
	}
	
	public void setRadniStaz (int promenaStaza) {
		this.godineRadnogStaza = promenaStaza;
	}
	
	public String getJmbg() {
		return this.jmbg;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public String getPrezime() {
		return this.prezime;
	}
	
	public int getBrojDece() {
		return this.brojDece;
	}
	
	public int getSSS() {
		return this.stepenStrucneSpreme;
	}
	
	public int getGodineStaza() {
		return this.godineRadnogStaza;
	}
	
	public double koeficijentSlozenosti(int stepenStrucneSpreme) {
		double koeficijent = 0;
		switch (stepenStrucneSpreme) {
		case 1:{
			koeficijent = 1.03;
		}			
			break;
		case 2:{
			koeficijent = 1.65;
		}			
			break;
		case 3:{
			koeficijent = 2.00;
		}			
			break;
		case 4:{
			koeficijent = 2.27;
		}			
			break;
		case 5:{
			koeficijent = 2.88;
		}			
			break;
		case 6:{
			koeficijent = 3.09;
		}			
			break;
		case 7:{
			koeficijent = 3.40;
		}			
			break;
		case 8:{
			koeficijent = 4.12;
		}			
			break;
			
		}
		
		return koeficijent;				
	}
	
	public double minuliRad (int godineStaza) {
		double koeficijent = 0;
		
		if (godineStaza <= 10) {
			koeficijent = 0.05;
		} else if (godineStaza > 10 && godineStaza <= 20) {
			koeficijent =  0.75;
		} else if (godineStaza > 20) {
			koeficijent = 0.1;
		}
		
		return koeficijent;
	}
	
	public double plataRadnika() {
		return 25000 + ((koeficijentSlozenosti(this.stepenStrucneSpreme) + minuliRad(this.godineRadnogStaza))*10000);
	}
	
	public boolean kreditnaSposbnost() {
		return plataRadnika() > 50000;
	}
	
	public int slobodniDani() {
		return 22 + (this.brojDece * 2);
	}
	public void ispisPodatakaORadniku() {
		System.out.println("Ime radnika " + this.ime + " " + this.prezime + " ima " + this.godineRadnogStaza + " godine radnog staza");
	}

}

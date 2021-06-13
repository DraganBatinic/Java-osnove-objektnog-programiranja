package radnik;

public class Radnik {
	private String jmbg;
	private String imeIPrezime;
	private int brojDece;
	private int stepenStrucneSpreme;
	private int godineRadnogStaza;
	
	public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza) {		
		this.jmbg = jmbg;
		this.imeIPrezime = imeIPrezime;
		this.brojDece = brojDece;
		this.stepenStrucneSpreme = stepenStrucneSpreme;
		this.godineRadnogStaza = godineRadnogStaza;
	}

	public Radnik(String jmbg) {		
		this.jmbg = jmbg;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getBrojDece() {
		return brojDece;
	}

	public void setBrojDece(int brojDece) {
		this.brojDece = brojDece;
	}

	public int getStepenStrucneSpreme() {
		return stepenStrucneSpreme;
	}

	public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
		this.stepenStrucneSpreme = stepenStrucneSpreme;
	}

	public int getGodineRadnogStaza() {
		return godineRadnogStaza;
	}

	public void setGodineRadnogStaza(int godineRadnogStaza) {
		this.godineRadnogStaza = godineRadnogStaza;
	}

	public String getJmbg() {
		return jmbg;
	}
	
	public double koeficijentSlozenosti() {
		
		double koeficijent = 0;
		
		switch (getStepenStrucneSpreme()) {
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
	
	public double minuliRad() {
		double koeficijentMinulogRada = 0;
		if (getGodineRadnogStaza() < 10) {
			koeficijentMinulogRada = 0.05;
		} else if (getGodineRadnogStaza() >= 10 && getGodineRadnogStaza() < 20) {
			koeficijentMinulogRada = 0.75;
		} else if (getGodineRadnogStaza() >= 20) {
			koeficijentMinulogRada = 0.1;
		}
		
		return koeficijentMinulogRada;
	}
	
	public double obracunPlate() {
		double plata = 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
		return plata;
	}
	
	public String kreditnaSposobnost() {
		String sposobnost = "";
		if (obracunPlate() > 50000) {
			sposobnost = "kreditno je sposoban";
		} else {
			sposobnost = "kreditno nije sposoban";
		}
		return sposobnost;
	}
	
	public int brojSlobodnihDana() {
		int brojDana = 22 + this.brojDece;
		return brojDana;
	}
	
	
	
}

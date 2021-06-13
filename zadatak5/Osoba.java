package zadatak5;

public class Osoba {
	private String ImeIPrezime;
	private String jmbg;
	
	
	public Osoba(String imeIPrezime, String jmbg) {		
		ImeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
	}


	public String getImeIPrezime() {
		return ImeIPrezime;
	}


	public void setImeIPrezime(String imeIPrezime) {
		ImeIPrezime = imeIPrezime;
	}


	public String getJmbg() {
		return jmbg;
	}
	
	private void stampaOOsobi() {
		System.out.println(this.ImeIPrezime + ", " + this.jmbg);
	}
	
	

}

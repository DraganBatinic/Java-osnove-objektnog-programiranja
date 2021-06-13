package fakultet;

public class Osoba {
	private String imeIPrezime;
	private String jmbg;
	
	public Osoba(String imeIPrezime, String jmbg) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
	}
	
	public void stampaOOsobi() {
		System.out.print(this.imeIPrezime + ", " + this.jmbg + ", ");
	}
	

}

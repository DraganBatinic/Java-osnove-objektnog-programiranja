package domaci1805;

public class Vozac extends Covek{
	
	private String zvanje;

	public Vozac(String imeIPrezime, String zvanje) {
		super(imeIPrezime);
		this.zvanje = zvanje;
	}

	public String getZvanje() {
		return zvanje;
	}
	
	

}

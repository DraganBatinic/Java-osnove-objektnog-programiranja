package domaci1305;

public class Autor {
	private String imeIPrezime;
	
	public Autor(String imeIPrezime) {		
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	public void stampaAutora() {
		System.out.println(this.imeIPrezime);
	}

}

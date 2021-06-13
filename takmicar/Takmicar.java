package takmicar;

public class Takmicar {
	private String imeIPrezime;
	private int norma;
	private int najboljiRezultat;
	
	public Takmicar(String imeIPrezime, int norma, int najboljiRezultat) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.norma = norma;
		this.najboljiRezultat = najboljiRezultat;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getNorma() {
		return norma;
	}

	public void setNorma(int norma) {
		this.norma = norma;
	}

	public int getNajboljiRezultat() {
		return najboljiRezultat;
	}

	public void setNajboljiRezultat(int najboljiRezultat) {
		this.najboljiRezultat = najboljiRezultat;
	}
	
	public boolean ispunioNormu() {
		return (this.najboljiRezultat >= this.norma);
	}
	
	public String toString() {
		return this.imeIPrezime + " (" + this.najboljiRezultat + ") ";
	}
	

}

package domaci1805;

public class Putnik extends Covek{
	private int svotaNovca;

	public Putnik(String imeIPrezime, int svotaNovca) {
		super(imeIPrezime);
		this.svotaNovca = svotaNovca;
	}

	public int getSvotaNovca() {
		return svotaNovca;
	}

	public void setSvotaNovca(int svotaNovca) {
		this.svotaNovca = svotaNovca;
	}
	
	public void dodajNovac (int dodataSuma) {
		setSvotaNovca(this.svotaNovca + dodataSuma);	
	}
	
	public void oduzmiNovac (int oduzetaSuma) {
		setSvotaNovca(this.svotaNovca - oduzetaSuma);
	}
	

}

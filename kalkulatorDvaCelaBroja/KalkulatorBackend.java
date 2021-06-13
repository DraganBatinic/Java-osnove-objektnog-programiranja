package kalkulatorDvaCelaBroja;

public class KalkulatorBackend {
	public int prviBroj;
	
	public KalkulatorBackend (int prviBroj) {
		this.prviBroj = prviBroj;
	}
	
	public int sabiranje (int drugiBroj) {
		return this.prviBroj + drugiBroj;
	}
	
	public int oduzimanje (int drugiBroj) {
		return this.prviBroj - drugiBroj;
	}
	
	public int mnozenje (int drugiBroj) {
		return this.prviBroj * drugiBroj;
	}
	
	public double deljenje (int drugiBroj) {
		return (double)this.prviBroj / drugiBroj;
	}

}

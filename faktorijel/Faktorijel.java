package faktorijel;

public class Faktorijel {
	private int broj;

	public Faktorijel(int broj) {
		super();
		this.broj = broj;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}
	
	public long racunanjeFaktorijela() {
		long faktorijel = 1;
		for (int i = this.broj; i > 0; i--) {
			faktorijel = faktorijel * this.broj;
		}
		return faktorijel;
	}

}

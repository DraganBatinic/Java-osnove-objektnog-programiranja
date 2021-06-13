package farenhajtUCelzijus;

public class FarenhajtUCelzijus {
	
	private int farenhajt;
	
	public FarenhajtUCelzijus(int farenhajt) {
		this.farenhajt = farenhajt;
	}
	public void setFarenhajt(int F) {
		this.farenhajt = F;
	}
	public int getFarenhajt() {
		return  this.farenhajt;
	}
	public double getCelzijus() {
		return  5*(this.farenhajt - 32)/9;
	}
	
}


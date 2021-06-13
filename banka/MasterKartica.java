package banka;

public class MasterKartica extends PlatnaKartica{

	public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
		super(suma, brojKartice, godina, mesec);
		// TODO Auto-generated constructor stub
	}
	
	public void izvrsiMasterTransakciju(double skinutaSvota) {		
		super.izvrsiTransakciju(skinutaSvota + (skinutaSvota / 100 * 1.5));		
	}
	
	public void naplatiOdrzavanje() {
		super.izvrsiTransakciju(2);
	}

}

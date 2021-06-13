package testKlase;
/*? ime planine 
? naziv države u kojoj se nalazi 
? visinu planine. 
a od javnih metoda: 
? default-ni konstruktor (konstruktor bez argumenata) i konstuktor koji postavlja sve parametre 
? gettere i settere za sve atribute */

public class Planina {
	private String imePlanine;
	private String imeDrzave;
	private int visinaPlanine;
	
	public Planina() {		
	}

	public Planina(String imePlanine, String imeDrzave, int visinaPlanine) {		
		this.imePlanine = imePlanine;
		this.imeDrzave = imeDrzave;
		this.visinaPlanine = visinaPlanine;
	}

	public String getImePlanine() {
		return imePlanine;
	}

	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}

	public String getImeDrzave() {
		return imeDrzave;
	}

	public void setImeDrzave(String imeDrzave) {
		this.imeDrzave = imeDrzave;
	}

	public int getVisinaPlanine() {
		return visinaPlanine;
	}

	public void setVisinaPlanine(int visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}	
	

}

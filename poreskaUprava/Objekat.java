package poreskaUprava;

public abstract class Objekat {
	private String adresa;
	private double povrsinaObjekta;
	private int zona;
	
	public Objekat(String adresa, double povrsinaObjekta, int zona) {
		super();
		this.adresa = adresa;
		this.povrsinaObjekta = povrsinaObjekta;
		this.zona = zona;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public double getPovrsinaObjekta() {
		return povrsinaObjekta;
	}

	public void setPovrsinaObjekta(double povrsinaObjekta) {
		this.povrsinaObjekta = povrsinaObjekta;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}
	
	public double koeficijentZaRacunanjePoreza() {
		
		double koeficijent = 0;
		switch (this.zona) {
		case 1:{
			koeficijent = 1.4;
		}			
			break;
		case 2:{
			koeficijent = 1.1;
		}			
			break;
		case 3:{
			koeficijent = 1.05;
		}			
			break;		
		}
		return koeficijent;
	}
	
	public abstract double racunanjePoreza();
	
	public abstract void stampaj();
	
		

}

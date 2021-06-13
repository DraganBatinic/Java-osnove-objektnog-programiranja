package poreskaUprava;

public class Zgrada extends Objekat{
	private int brojStanova;

	public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
		super(adresa, povrsinaObjekta, zona);
		this.brojStanova = brojStanova;
	}

	public int getBrojStanova() {
		return brojStanova;
	}

	public void setBrojStanova(int brojStanova) {
		this.brojStanova = brojStanova;
	}
	
	@Override
	public double racunanjePoreza() {
		// TODO Auto-generated method stub
		return super.getPovrsinaObjekta() * this.brojStanova * super.koeficijentZaRacunanjePoreza();
	}
	
	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Objekat je zgrada. U zgradi ima: " + this.brojStanova);
		System.out.println("Zgrada se nalazi na adresi: " + super.getAdresa());
		System.out.println("Povrsina zgrade je: " + super.getPovrsinaObjekta());
		System.out.println("Zgrada se nalazi u zoni: " + super.getZona());
		System.out.println("Porez za zgradu iznosi: " + this.racunanjePoreza());
		
	}

}

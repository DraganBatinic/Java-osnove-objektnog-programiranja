package poreskaUprava;

public class Kuca extends Objekat{
	private int brojClanova;

	public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanova) {
		super(adresa, povrsinaObjekta, zona);
		this.brojClanova = brojClanova;
	}

	public int getBrojClanova() {
		return brojClanova;
	}

	public void setBrojClanova(int brojClanova) {
		this.brojClanova = brojClanova;
	}

	@Override
	public double racunanjePoreza() {
		// TODO Auto-generated method stub
		return super.getPovrsinaObjekta() * super.koeficijentZaRacunanjePoreza();
	}

	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Objekat je kuca. U kuci zivi: " + this.brojClanova + " clanova domacinstva");
		System.out.println("Kuca se nalazi na adresi: " + super.getAdresa());
		System.out.println("Povrsina kuce je: " + super.getPovrsinaObjekta() + "m2");
		System.out.println("Kuca se nalazi u zoni: " + super.getZona());
		System.out.println("Porez za kucu iznosi: " + this.racunanjePoreza() + " dinara");
		
	}
	
	

}

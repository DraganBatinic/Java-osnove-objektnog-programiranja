package poreskaUprava;

public class Lokal extends Objekat{

	public Lokal(String adresa, double povrsinaObjekta, int zona) {
		super(adresa, povrsinaObjekta, zona);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double racunanjePoreza() {
		// TODO Auto-generated method stub
		return super.getPovrsinaObjekta() * super.koeficijentZaRacunanjePoreza() * 1.3;
	}

	@Override
	public void stampaj() {
		// TODO Auto-generated method stub
		System.out.println("Objekat je lokal");
		System.out.println("Lokal se nalazi na adresi: " + super.getAdresa());
		System.out.println("Povrsina lokala je: " + super.getPovrsinaObjekta());
		System.out.println("Lokal se nalazi u zoni: " + super.getZona());
		System.out.println("Porez za lokal iznosi: " + this.racunanjePoreza());
		
	}

}

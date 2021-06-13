package zadatak5;

public class Profesor extends Osoba{
	private String predmet;

	public Profesor(String imeIPrezime, String jmbg, String predmet) {
		super(imeIPrezime, jmbg);
		this.predmet = predmet;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	
	public void stampajOProfesoru() {
		System.out.println(super.getImeIPrezime() + ", " + super.getJmbg() + ", " + this.predmet);
	}

}

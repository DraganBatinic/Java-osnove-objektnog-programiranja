package fakultet;

public class Profesor extends Osoba{
	private String nazivPredmeta;

	public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta) {
		super(imeIPrezime, jmbg);
		this.nazivPredmeta = nazivPredmeta;
	}
	
	public void stampaOProfesoru() {
		super.stampaOOsobi();
		System.out.println(this.nazivPredmeta);
	}

}

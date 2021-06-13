package fakultet;

public class Student extends Osoba{
	private int brojIndeksa;

	public Student(String imeIPrezime, String jmbg, int brojIndeksa) {
		super(imeIPrezime, jmbg);
		this.brojIndeksa = brojIndeksa;
	}
	
	public void stampaOStudentu() {
		super.stampaOOsobi();
		System.out.println(this.brojIndeksa);
	}

}

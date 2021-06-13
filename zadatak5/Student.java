package zadatak5;

public class Student extends Osoba{
	private int brojIndeksa;

	public Student(String imeIPrezime, String jmbg, int brojIndeksa) {
		super(imeIPrezime, jmbg);
		this.brojIndeksa = brojIndeksa;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}
	
	public void stampaOStudentu() {
		System.out.println(super.getImeIPrezime() + ", " + super.getJmbg() + ", " + this.brojIndeksa);
	}

}

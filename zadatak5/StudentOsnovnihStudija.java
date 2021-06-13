package zadatak5;

public class StudentOsnovnihStudija extends Student{
	private String smer;

	public StudentOsnovnihStudija(String imeIPrezime, String jmbg, int brojIndeksa, String smer) {
		super(imeIPrezime, jmbg, brojIndeksa);
		this.smer = smer;
	}

	public String getSmer() {
		return smer;
	}

	public void setSmer(String smer) {
		this.smer = smer;
	}
	
	public void stampaOStudentuOsnovnihStudija() {
		System.out.println(super.getImeIPrezime() + ", " + super.getBrojIndeksa() + ",studira na smeru" + this.smer);
	}

}

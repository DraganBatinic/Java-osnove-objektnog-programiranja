package zadatak5;

public class StudentMasterStudija extends StudentOsnovnihStudija{
	private double prosekOsnovnihStudija;
	private String smerMasterStudija;
	public StudentMasterStudija(String imeIPrezime, String jmbg, int brojIndeksa, String smer,
			int prosekOsnovnihStudija, String smerMasterStudija) {
		super(imeIPrezime, jmbg, brojIndeksa, smer);
		this.prosekOsnovnihStudija = prosekOsnovnihStudija;
		this.smerMasterStudija = smerMasterStudija;
	}
	public double getProsekOsnovnihStudija() {
		return prosekOsnovnihStudija;
	}
	public void setProsekOsnovnihStudija(int prosekOsnovnihStudija) {
		this.prosekOsnovnihStudija = prosekOsnovnihStudija;
	}
	public String getSmerMasterStudija() {
		return smerMasterStudija;
	}
	public void setSmerMasterStudija(String smerMasterStudija) {
		this.smerMasterStudija = smerMasterStudija;
	}
	
	public void stampaOStudentuMasterStudija() {
		System.out.println(super.getImeIPrezime() + ", broj indeksa: " + super.getBrojIndeksa() + " je na smeru master studija " + this.smerMasterStudija + ", a zavrsio je osnovne studije " + super.getSmer() + " sa prosekom " + this.prosekOsnovnihStudija);
	}

}

package zadatak7;

public class StudentOsnovnihStudija extends Student{

	public StudentOsnovnihStudija(String imeIPrezime, int brojIndeksa, int godinaStudija) {
		super(imeIPrezime, brojIndeksa, godinaStudija);		
	}
	
	public double cenaSkolarine() {
		double skolarina = super.cenaSkolarine() + 90000;
		return skolarina;
	}
	
	public boolean budzetskiStudent() {
		boolean budzet = true;
		if (super.getGodinaStudija() < 5) {
			budzet = true;
		} else {
			budzet = false;
		}
		return budzet;
	}
	

}

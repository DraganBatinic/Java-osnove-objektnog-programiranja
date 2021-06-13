package zadatak7;

public class StudentMaster extends Student{

	public StudentMaster(String imeIPrezime, int brojIndeksa, int godinaStudija) {
		super(imeIPrezime, brojIndeksa, godinaStudija);		
	}
	
	public double cenaSkolarine() {
		double skolarina = super.cenaSkolarine() + 100000;
		return skolarina;
	}
	
	public boolean budzetskiStudent() {
		boolean budzet = true;
		if (super.getGodinaStudija() < 2) {
			budzet = true;
		} else {
			budzet = false;
		}
		return budzet;
	}
	

}

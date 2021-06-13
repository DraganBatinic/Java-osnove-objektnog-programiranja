package studenti;

public class StudentOsnovnihStudija extends Student{

	public StudentOsnovnihStudija(String imeiPrezime, String brojIndeksa, int godinaStudija) {
		super(imeiPrezime, brojIndeksa, godinaStudija);
		// TODO Auto-generated constructor stub
	}
	
	public int racunanjeCeneSkolarine() {
		if(super.getGodinaStudija() >= 5) {
			return 90000;
		} else {
			return 0;
		}
	}
	
	public boolean budzetskiStudent() {
		if(super.getGodinaStudija() < 5) {
			return true;
		} else {
			return false;
		}
	}

}

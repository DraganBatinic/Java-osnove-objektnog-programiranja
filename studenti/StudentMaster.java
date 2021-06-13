package studenti;

public class StudentMaster extends Student{

	public StudentMaster(String imeiPrezime, String brojIndeksa, int godinaStudija) {
		super(imeiPrezime, brojIndeksa, godinaStudija);
		// TODO Auto-generated constructor stub
	}
	
	public int racunanjeCeneSkolarine() {
		if(super.getGodinaStudija() >= 2) {
			return 100000;
		} else {
			return 0;
		}
	}
	
	public boolean budzetskiStudent() {
		if(super.getGodinaStudija() < 2) {
			return true;
		} else {
			return false;
		}
	}

}

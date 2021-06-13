package studenti;

public class Student {
	private String imeiPrezime;
	private String brojIndeksa;
	private int godinaStudija;
	
	public Student(String imeiPrezime, String brojIndeksa, int godinaStudija) {
		super();
		this.imeiPrezime = imeiPrezime;
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
	}

	public String getImeiPrezime() {
		return imeiPrezime;
	}

	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
	public int racunanjeCeneSkolarine() {
		return 0;
	}
	
	public boolean budzetskiStudent() {
		return true;
	}
	
	public void stampaOStudentu() {
		String finansiranje = "";
		if(this.budzetskiStudent() == true) {
			finansiranje ="budzet";
		} else {
			finansiranje ="samofinansirajuci";
		}
		System.out.println(this.imeiPrezime + ", " + this.brojIndeksa + ", " + this.godinaStudija);
		System.out.println("Finansiranje: " +  finansiranje);
		System.out.println("Cena Skolarine: " + this.racunanjeCeneSkolarine());
	}
	
	

}

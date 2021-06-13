package zadatak7;
//Kreirati klasu Student koja ima:
//●ime i prezime studenta
//●broj indeksa
//●godinu studija
//●gettere, settere i konstruktore
//●metodu koja racuna i vraca cenu skolarine, metoda vraca 0 u ovoj klasi.
//●metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
//●metodu koja stampa podatke u formatu:
//ime i prezime, broj indeksa, godina studijaFinansiranje: budzet/samofinansirajuciCena skolarine: cena

public class Student {
	private String imeIPrezime;
	private int brojIndeksa;
	private int godinaStudija;
	
	public Student(String imeIPrezime, int brojIndeksa, int godinaStudija) {		
		this.imeIPrezime = imeIPrezime;
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
	public double cenaSkolarine() {
		double skolarina = 0;
		return skolarina;
	}
	
	public boolean budzetskiStudent() {
		boolean budzet = true;
		return budzet;
	}
	
	public void stampaOStudentu() {
		String budzet = "";
		if (budzetskiStudent() == true) {
			budzet = "budzet";			
		} else {
			budzet = "samofinasirajuci";
		}
		System.out.println(this.imeIPrezime + ", " + this.brojIndeksa + ", Godina studija: " + this.godinaStudija + ", Finansiranje: " + budzet + ", Cena skolarine: " + cenaSkolarine());;
	}
	

}

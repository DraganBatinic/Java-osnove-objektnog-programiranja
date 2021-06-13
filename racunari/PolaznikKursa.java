package racunari;

public class PolaznikKursa {
	private String imeIPrezime;
	private Racunar polaznikovRacunar;
	
	public PolaznikKursa(String imeIPrezime) {		
		this.imeIPrezime = imeIPrezime;		
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public Racunar getPolaznikovRacunar() {
		return polaznikovRacunar;
	}

	public void setPolaznikovRacunar(Racunar polaznikovRacunar) {
		this.polaznikovRacunar = polaznikovRacunar;
	}
	
	public void stampaKojiRacunarPolaznikKoristi() {
		System.out.print(this.imeIPrezime + " koristi racunar: ");
		polaznikovRacunar.stampaRacunara();
	}

}

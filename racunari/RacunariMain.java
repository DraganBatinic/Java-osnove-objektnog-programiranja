package racunari;

public class RacunariMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolaznikKursa dragan = new PolaznikKursa("Dragan Batinic");
		
		Racunar licni = new Racunar("Intel", "Celeron", 512, "jebac keve");
		
		dragan.setPolaznikovRacunar(licni);
		
		dragan.stampaKojiRacunarPolaznikKoristi();

	}

}

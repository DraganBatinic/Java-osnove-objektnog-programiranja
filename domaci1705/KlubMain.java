package domaci1705;

public class KlubMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klub radnik = new Klub("Radnik", "Smederevska Palanka", 1973);
		
		Sportista s1 = new Sportista("Dragan", "Batinic", 1979);
		Sportista s2 = new Sportista("Marko", "Markovic", 1980);
		Sportista s3 = new Sportista("Petar", "Petrovic", 1981);
		Sportista s4 = new Sportista("Zdravko", "Zdravkovic", 1982);
		
		s1.stampaOSportisti();
		System.out.println("--------------------------");
		radnik.dodavanjeSportiste(s1);
		radnik.dodavanjeSportiste(s2);
		radnik.dodavanjeSportiste(s3);
		radnik.dodavanjeSportiste(s4);
		radnik.stampaSportistaUKlubu();
		System.out.println("--------------------------");
		radnik.uklanjanjeSportiste("Petar", "Petrovic");
		radnik.stampaSportistaUKlubu();

	}

}

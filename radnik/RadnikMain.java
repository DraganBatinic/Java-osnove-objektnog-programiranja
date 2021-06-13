package radnik;

public class RadnikMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Radnik dragan = new Radnik("1107979761026", "Dragan Batinic", 1, 7, 19);
		Radnik uros = new Radnik("2805005000321", "Uros Batinic", 0, 4, 5);
		Radnik marija = new Radnik("3011980761032", "Marija Batinic", 1, 4, 22);
		
		Firma vode = new Firma("Vode Vojvodine", "vodoprivreda", 2000, null);
		Firma jugolab = new Firma("Jugolab", "laboratorija", 1989, null);
		Firma optimum = new Firma("Optimum", "stamparija", 1998, null);
		
		vode.dodavanjeRadnika(dragan);
		vode.dodavanjeRadnika(uros);
		jugolab.dodavanjeRadnika(marija);
		
		vode.ispisORadnicimaFirme();
		System.out.println("");
		jugolab.ispisORadnicimaFirme();
		System.out.println("");
		optimum.ispisORadnicimaFirme();
				
		
		//System.out.println("Radnik " + dragan.getImeIPrezime() + " ima platu od: " + dragan.obracunPlate() +
			//	" i " + dragan.kreditnaSposobnost() + ", a ima " + dragan.brojSlobodnihDana() + " dana godisnjeg odmora");

	}

}

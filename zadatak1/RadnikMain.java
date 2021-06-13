package zadatak1;

import java.util.ArrayList;

public class RadnikMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firma vodeVojvodine = new Firma("Vode Vojvodine", "vodoprivreda", 2000) ;
		Firma optimum = new Firma("Optimum", "stamparija", 1996) ;
		
		ArrayList<Firma> listaFirmi = new ArrayList<Firma>();
		listaFirmi.add(vodeVojvodine);
		listaFirmi.add(optimum);
		
		for (int i = 0; i < listaFirmi.size(); i++) {
			listaFirmi.get(i).stampajOFirmi();
		}
				
		
		Radnik dragan = new Radnik("1107979761026", "Dragan", "Batinic", 1, 7, 19);
		String kreditnaSposobnost = "";
		if (dragan.kreditnaSposbnost() == true) {
			kreditnaSposobnost = "kreditno je sposoban";
		} else {
			kreditnaSposobnost = "kreditno nije sposoban";
		}
		
		System.out.println("Radnik " + dragan.getIme() + " " + dragan.getPrezime() + " ima platu od " + dragan.plataRadnika() 
							+ " i " + kreditnaSposobnost +  ", a ima " + dragan.slobodniDani() + " slobodnih dana");
		
		vodeVojvodine.zaposljavanjeRadnika(dragan);
		//vodeVojvodine.zaposljavanjeRadnika(dragana);
		vodeVojvodine.ispisPodatakaOZaposlenima();
		optimum.ispisPodatakaOZaposlenima();
		

	}

}
